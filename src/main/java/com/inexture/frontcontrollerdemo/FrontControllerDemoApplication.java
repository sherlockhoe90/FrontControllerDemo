package com.inexture.frontcontrollerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontControllerDemoApplication {

    @GetMapping("/person")
    public String sayHello() {
        String greeting = "Hello World";
        System.out.println(greeting);
        return greeting;
    }

}
