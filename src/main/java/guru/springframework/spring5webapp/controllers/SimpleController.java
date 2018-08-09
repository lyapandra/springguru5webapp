package guru.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class SimpleController {

    public String hello(){
        System.out.println("Hello!!!");

        return "foo";
    }
}
