package com.inexture.frontcontrollerdemo;

import com.inexture.service.StackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FrontControllerDemoApplication {

    // Get the application context (container)
//    ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/springrest-servlet.xml");
//    StackService service = (StackService) ctx.getBean("serviceObject");

    @Autowired
    StackService stackService;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public String sayHello() {
        String greeting = "Hello World";
        System.out.println(greeting);
        return greeting;
    }

    @RequestMapping(value = "/push/{number}", method = RequestMethod.GET)
    public String push(@PathVariable int number) {
        return stackService.push(number);
    }

    @RequestMapping(value = "/pop", method = RequestMethod.GET)
    public String pop() {
        return stackService.pop();
    }


    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String flightError(Exception e) {
        return e.getMessage();
    }

}
