package com.hroauth.oauth.services;

import com.hroauth.oauth.entity.User;
import com.hroauth.oauth.feigmClients.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    private UserFeignClient userFeignClient;

    public User findByEmail(String email) throws Exception {
        User user = userFeignClient.findByEmail(email).getBody();
        if(user == null){
            throw new Exception("Email não encontrado");
        }
        return user;
    }
}
