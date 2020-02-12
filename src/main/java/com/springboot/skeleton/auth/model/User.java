package com.springboot.skeleton.auth.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "\"user\"")
@Getter @Setter @NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;

    @Transient
    @Column(name="passwordConfirm")
    private String passwordConfirm;

    @ManyToMany
    private Set<Role> roles;
}
