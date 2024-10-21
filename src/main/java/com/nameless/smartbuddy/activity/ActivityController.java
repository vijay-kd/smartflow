package com.nameless.smartbuddy.activity;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {

    @GetMapping
    public ResponseEntity<?> test() {
        return ResponseEntity.ok("Welcome back MR. VJ");
    }
}
