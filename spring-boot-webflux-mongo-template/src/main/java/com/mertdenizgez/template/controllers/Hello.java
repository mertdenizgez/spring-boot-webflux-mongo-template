package com.mertdenizgez.template.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController()
@RequestMapping("/api")
public class Hello {

    @GetMapping("/hello")
    public Mono<String> getHelloWorld() {
        return Mono.just("Hello World");
    }

}
