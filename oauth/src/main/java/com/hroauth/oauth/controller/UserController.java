package com.hroauth.oauth.controller;

import com.hroauth.oauth.entity.User;
import com.hroauth.oauth.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserServices userServices;

    @GetMapping(value = "/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email) throws Exception {
        User user = userServices.findByEmail(email);
        return ResponseEntity.ok(user);
    }
}
