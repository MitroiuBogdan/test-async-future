package com.example.async.remote;

import com.example.async.model.PermissionPOJO;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class PermissionClient {


    CompletableFuture<PermissionPOJO> callAPI(String id, String message) {
        return CompletableFuture.supplyAsync(() ->
        {
            if (id == null || message == null) {
                throw new RuntimeException("null permission");

            } else {
             return  new PermissionPOJO(id, message);
            }

        });

    }
}
