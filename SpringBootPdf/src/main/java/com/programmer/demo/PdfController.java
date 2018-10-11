package com.programmer.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PdfController {

    @GetMapping()
    public String getPdf(){
        return "showPdf";
    }
}
