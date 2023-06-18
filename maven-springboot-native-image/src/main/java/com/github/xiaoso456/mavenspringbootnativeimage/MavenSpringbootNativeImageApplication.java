package com.github.xiaoso456.mavenspringbootnativeimage;

import com.github.xiaoso456.mavenspringbootnativeimage.pojo.User;
import com.github.xiaoso456.mavenspringbootnativeimage.tip.AopTip;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportRuntimeHints;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Slf4j
@ImportRuntimeHints(AopTip.class)
public class MavenSpringbootNativeImageApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MavenSpringbootNativeImageApplication.class, args);
        User myUser = run.getBean(User.class);
        log.info("my user:{}",myUser);
    }

}
