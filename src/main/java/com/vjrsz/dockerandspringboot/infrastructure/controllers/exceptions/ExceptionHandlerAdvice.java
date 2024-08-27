package com.vjrsz.dockerandspringboot.infrastructure.controllers.exceptions;

import com.vjrsz.dockerandspringboot.adapters.presenters.exceptions.ErrorPresenter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorPresenter> handleGlobalException(Exception ex, WebRequest request) {
        ErrorPresenter errorPresenter = new ErrorPresenter(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Ocorreu um erro inesperado no servidor.",
                new HashMap<>());

        return ResponseEntity.badRequest().body(errorPresenter);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ErrorPresenter> handleHttpMessageNotReadableException(HttpMessageNotReadableException ex) {
        ErrorPresenter errorPresenter = new ErrorPresenter(
                HttpStatus.BAD_REQUEST.value(),
                "Corpo da requisição não encontrado ou mal formatado",
                new HashMap<>());

        return ResponseEntity.badRequest().body(errorPresenter);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorPresenter> handleValidationExceptions(MethodArgumentNotValidException ex) {
        HashMap<String, String> errors = new HashMap<>();

        ex.getBindingResult().getFieldErrors().forEach(error ->
                errors.put(error.getField(), error.getDefaultMessage()));

        ErrorPresenter errorPresenter = new ErrorPresenter(
                HttpStatus.BAD_REQUEST.value(),
                "Alguns campos obrigatórios estão faltando ou foram preenchidos de forma incorreta.",
                errors);

        return ResponseEntity.badRequest().body(errorPresenter);
    }

}
