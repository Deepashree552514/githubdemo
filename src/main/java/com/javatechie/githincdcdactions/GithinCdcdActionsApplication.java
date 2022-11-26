package com.javatechie.githincdcdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.find.annotation.RestController;
@SpringBootApplication
@RestController

public class GithinCdcdActionsApplication {

    @Getmapping("/welcome")
 public string welcome(){
     return "Welcome to javatechie";
 }
    public static void main(String[] args) {
        SpringApplication.run(GithinCdcdActionsApplication.class, args);
    }

}
