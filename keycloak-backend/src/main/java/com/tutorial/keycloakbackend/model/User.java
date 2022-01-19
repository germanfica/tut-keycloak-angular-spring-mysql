package com.tutorial.keycloakbackend.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
//@RequiredArgsConstructor
@NoArgsConstructor // JPA requires that this constructor be defined as public or protected
@Entity(name = "User")
@Table(name = "user")
public class User {
    // == fields ==
    @Column(nullable = false)
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String username;
}
