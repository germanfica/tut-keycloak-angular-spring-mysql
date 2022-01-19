package com.tutorial.keycloakbackend.controller;

import com.tutorial.keycloakbackend.dto.ResponseMessage;
import com.tutorial.keycloakbackend.dto.UserDataOnly;
import com.tutorial.keycloakbackend.model.User;
import com.tutorial.keycloakbackend.repository.UserRepository;
import com.tutorial.keycloakbackend.service.KeycloakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    // == fields ==
    private KeycloakService keycloakService;

    // == constructors ==
    @Autowired
    private UserController(KeycloakService keycloakService) {
        this.keycloakService = keycloakService;
    }

    // == methods ==
    @PostMapping("/create")
    public ResponseEntity<ResponseMessage> create(@RequestBody UserDataOnly userDataOnly){
        Object[] obj = keycloakService.createUser(userDataOnly);
        int status = (int) obj[0];
        ResponseMessage message = (ResponseMessage) obj[1];

        return ResponseEntity.status(status).body(message);
    }
}
