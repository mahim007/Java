package com.example.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class myController {

    @GetMapping("/welcome")
    public String getMessage(){
        return "showPdf";
    }

}
