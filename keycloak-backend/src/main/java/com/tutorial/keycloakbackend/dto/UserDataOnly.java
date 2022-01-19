package com.tutorial.keycloakbackend.dto;

import lombok.Value;

@Value
public class UserDataOnly {
    private String username, email, firstName, lastName, password;
}
