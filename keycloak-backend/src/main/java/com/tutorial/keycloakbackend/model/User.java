package com.tutorial.keycloakbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor // JPA requires that this constructor be defined as public or protected
@Entity(name = "User")
@Table(name = "user")
public class User {
    // == fields ==
    @Column(nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(
            nullable = false,
            updatable = false,
            unique = true,
            columnDefinition = "VARCHAR(255)"
    )
    @JsonProperty("username")
    @NonNull
    private String username;
}
