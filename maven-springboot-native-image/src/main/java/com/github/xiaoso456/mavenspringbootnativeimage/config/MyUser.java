package com.github.xiaoso456.mavenspringbootnativeimage.config;

import com.github.xiaoso456.mavenspringbootnativeimage.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyUser {

    @Bean
    public User user(){
        return new User("xiaoso465",1);
    }
}
