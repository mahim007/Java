package com.programmer.demo;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PdfGen {

    private final String dest="src/main/resources/result/mydoc.pdf";

    public void m1() throws FileNotFoundException, DocumentException {
        Document document=new Document();
        PdfWriter.getInstance(document, new FileOutputStream(dest));

        document.setPageSize(PageSize.A4);
        document.setMargins(36,72, 40,40);
        document.setMarginMirroring(true);

        document.open();

        Paragraph paragraph=new Paragraph();
        Phrase phrase=new Phrase();
        StringBuilder stringBuilder=new StringBuilder("");
        for (int i=1;i<=1000;i++){
            stringBuilder.append("mahim ");
        }
        phrase.add(stringBuilder.toString());
        paragraph.add(phrase);
        document.add(paragraph);

        document.close();
    }
}
