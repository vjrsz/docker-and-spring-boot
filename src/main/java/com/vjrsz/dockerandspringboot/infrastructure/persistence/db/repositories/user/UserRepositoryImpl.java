package com.vjrsz.dockerandspringboot.infrastructure.persistence.db.repositories.user;

import com.vjrsz.dockerandspringboot.adapters.repositories.UserRepository;
import com.vjrsz.dockerandspringboot.core.entities.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
public class UserRepositoryImpl implements UserRepository {
    private UserRepositoryJpa userRepositoryJpa;

    @Override
    public List<User> getAll() {
        return userRepositoryJpa
                .findAll()
                .stream()
                .map(userData -> new User(userData.getId(),
                        userData.getName(),
                        userData.getEmail(),
                        userData.getPassword()))
                .collect(Collectors.toList());
    }
}
