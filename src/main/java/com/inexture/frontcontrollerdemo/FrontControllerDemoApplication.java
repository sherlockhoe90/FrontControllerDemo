package com.inexture.frontcontrollerdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontControllerDemoApplication {

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public String sayHello() {
        String greeting = "Hello World";
        System.out.println(greeting);
        return greeting;
    }

}
