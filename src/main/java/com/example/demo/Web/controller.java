package com.example.demo.Web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/welcome")
    public ResponseEntity<String> welcome(){
        return new  ResponseEntity<String>("Welcome home", HttpStatus.OK);
    }
}
