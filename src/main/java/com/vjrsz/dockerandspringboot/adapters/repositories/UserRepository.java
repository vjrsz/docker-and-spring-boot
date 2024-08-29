package com.vjrsz.dockerandspringboot.adapters.repositories;

import com.vjrsz.dockerandspringboot.core.entities.User;

import java.util.List;

public interface UserRepository {
    public List<User> getAll();
}
