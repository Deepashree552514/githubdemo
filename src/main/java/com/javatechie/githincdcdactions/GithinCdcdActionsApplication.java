package com.javatechie.githincdcdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
