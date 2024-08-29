package com.vjrsz.dockerandspringboot.infrastructure.persistence.db.repositories.user;

import com.vjrsz.dockerandspringboot.infrastructure.persistence.db.entities.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryJpa extends JpaRepository<UserData, Long> {
}
