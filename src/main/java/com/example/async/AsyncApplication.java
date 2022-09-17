package com.example.async;

import com.example.async.remote.ActivateRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AsyncApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AsyncApplication.class, args);
    }

    @Autowired
    ActivateRemoteService activateRemoteService;

    @Override
    public void run(String... args) throws Exception {

        activateRemoteService.createPermission();


    }
}
