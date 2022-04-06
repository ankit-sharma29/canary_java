package com.canary.canaryjava.controller;

import com.canary.canaryjava.model.ServerStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/api/status")
    public ResponseEntity<ServerStatus> health() {
       ServerStatus serverStatus = ServerStatus.builder().status(200).message("server is healthy").build();
        return ResponseEntity.ok(serverStatus);
    }
}
