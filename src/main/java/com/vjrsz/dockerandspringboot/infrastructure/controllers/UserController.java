package com.vjrsz.dockerandspringboot.infrastructure.controllers;

import com.vjrsz.dockerandspringboot.adapters.presenters.exceptions.UserPresenter;
import com.vjrsz.dockerandspringboot.core.useCases.user.GetAllUserUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {
    private GetAllUserUseCase getAllUserUseCase;

    @GetMapping
    public ResponseEntity<List<UserPresenter>> getUsers() {
       List<UserPresenter> users = getAllUserUseCase
                .execute(new GetAllUserUseCase.InputValues())
                .users()
                .stream()
                .map(user -> new UserPresenter(user.getId(), user.getName(), user.getEmail()))
                .collect(Collectors.toList());

        return ResponseEntity.ok().body(users);
    }
}
