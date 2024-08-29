[SPRING_BADGE]: https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white
[POSTGRES_BADGE]:https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white
[DOCKER_BADGE]:https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white

<h1 align="center" style="font-weight: bold;">Spring Boot e Postgres usando Docker💻</h1>

![docker][DOCKER_BADGE]
![spring][SPRING_BADGE]
![postgres][POSTGRES_BADGE]

<p align="center">
 <a href="#started">Getting Started</a> • 
  <a href="#routes">API Endpoints</a> •
 <a href="#colab">Collaborators</a> •
 <a href="#contribute">Contribute</a>
</p>

<p align="center">
  <b>Este projeto é uma demonstração de como integrar Spring Boot com Docker e PostgreSQL. Ele utiliza Docker e Docker Compose para criar um ambiente de desenvolvimento isolado e reproduzível, facilitando a criação e execução de uma aplicação Spring Boot com um banco de dados PostgreSQL.</b>
</p>


<h2 id="started">🚀 Primeiros passos</h2>

Esta seção descreve como executar o projeto localmente.

<h3>Pré-requisitos</h3>

Certifique-se de ter os seguintes pré-requisitos:

- [Docker](https://www.docker.com/) - Plataforma de contêiner para construir e executar aplicativos.
- [Docker Compose](https://docs.docker.com/compose/) - Ferramenta para definir e executar aplicativos Docker multicontêiner.
- [Java JDK 17](https://www.oracle.com/) - Necessário para executar aplicativos Spring Boot.
- [PostgreSQL](https://www.postgresql.org/) - Banco de dados relacional usado pelo aplicativo.

<h3>Clonagem</h3>

Para clonar o repositório do projeto, use o seguinte comando:

```bash
git clone https://github.com/your-username/docker-and-spring-boot.git
```

<h3>Variáveis de ambiente</h3>
Nenhuma variável de ambiente é necessária para este projeto, pois ele usa o Docker para gerenciar a configuração. Certifique-se de que seu arquivo docker-compose.yml tenha a configuração correta para o PostgreSQL.

<h3>Começando</h3>
Para iniciar o projeto, navegue até o diretório do projeto e execute o Docker Compose:

```bash
cd docker-and-spring-boot
docker-compose up --build
```

Este comando criará as imagens do Docker e iniciará os contêineres para o aplicativo Spring Boot e o banco de dados PostgreSQL.

<h2 id="routes">📍 API Endpoints</h2>

| route                         | description                                                            |
|-------------------------------|------------------------------------------------------------------------|
| <kbd>GET users/</kbd>         | Retorna todos os usuários do banco de dados [response](#get-all-users) |

<h3 id="get-all-users">GET /users</h3>

**RESPONSE**
```json
[
  {
    "id": 1,
    "name": "João",
    "email": "joao@gmail.com"
  },
  {
    "id": 2,
    "name": "Maria",
    "email": "maria@gmail.com"
  },
  {
    "id": 3,
    "name": "Felipe",
    "email": "felipe@gmail.com"
  }
]
```



