package com.example.REST_API1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    @GetMapping("/api1")
    public String hello_world(){
        return "Hello";
    }
}
