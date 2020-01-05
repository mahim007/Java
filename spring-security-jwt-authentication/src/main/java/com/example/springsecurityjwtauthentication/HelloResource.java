package com.example.springsecurityjwtauthentication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloResource {

    @RequestMapping({"/hello"})
    public String hello() {
        return "hello world!";
    }
}
