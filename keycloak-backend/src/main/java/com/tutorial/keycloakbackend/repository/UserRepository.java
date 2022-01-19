package com.tutorial.keycloakbackend.repository;

import com.tutorial.keycloakbackend.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {
    Iterable<User> findAll();

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);
}
