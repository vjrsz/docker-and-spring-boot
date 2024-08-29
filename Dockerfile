# Usar a imagem do Maven com JDK 17 para a fase de build
FROM maven:3.9.9-amazoncorretto-17 AS build

# Copiar o código-fonte e o arquivo pom.xml para a imagem
COPY src /app/src
COPY pom.xml /app

# Definir o diretório de trabalho e executar a build do Maven
WORKDIR /app
RUN mvn clean install -DskipTests

# Usar a imagem do OpenJDK 17 JRE em Alpine Linux para a fase final
FROM amazoncorretto:17-alpine

# Copiar o JAR gerado na fase de build para o diretório /app na nova imagem
COPY --from=build /app/target/*.jar /app/app.jar

# Definir o diretório de trabalho
WORKDIR /app

# Expor a porta 8080
EXPOSE 8080

# Comando para iniciar a aplicação Spring Boot
CMD ["java", "-jar", "app.jar"]
