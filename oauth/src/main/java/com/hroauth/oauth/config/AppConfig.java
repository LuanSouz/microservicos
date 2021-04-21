package com.hroauth.oauth.config;

import com.hroauth.oauth.entity.User;
import com.hroauth.oauth.feigmClients.UserFeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean
    public UserFeignClient restTemplate(){
        return new UserFeignClient() {
            @Override
            public ResponseEntity<User> findByEmail(String email) {
                return null;
            }
        };
    }
}
