package com.windcf.sprintbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EnableJpaAuditing
@SpringBootApplication
public class SprintbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SprintbootDemoApplication.class);
//        application.addListeners(new ApplicationStatingListener());
        application.run(args);
    }

}
