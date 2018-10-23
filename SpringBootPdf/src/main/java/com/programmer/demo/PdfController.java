package com.programmer.demo;

import com.itextpdf.text.DocumentException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.FileNotFoundException;

@Controller
public class PdfController {

    @GetMapping("/hi")
    public String getPdf() throws FileNotFoundException, DocumentException {
        PdfGen pdfGen=new PdfGen();
        pdfGen.m1();
        return "showPdf";
    }
}
