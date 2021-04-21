package com.hroauth.oauth.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private Long id;
    private String email;
    private String name;
    private String password;
    private Set<Role> roles = new HashSet<>();

}
