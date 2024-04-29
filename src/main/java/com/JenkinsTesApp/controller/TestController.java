package com.JenkinsTesApp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test1")
    public String testApp(){
        return "test 1";

    }
    @GetMapping("/test2")
    public String testApp2(){
        return "test 2";

    }
    @GetMapping("/test3")
    public String testApp3(){
        return "test 3";

    }

}
