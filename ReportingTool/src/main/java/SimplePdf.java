package main.java;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;

public class SimplePdf {
    public static void main(String[] args) throws FileNotFoundException {
        String dest="document.pdf";
        PdfWriter writer=new PdfWriter(dest);
        PdfDocument pdf=new PdfDocument(writer);
        Document document=new Document(pdf);

        String s1="The journey commenced with a single tutorial on HTML in 2006 and elated by the response it generated, we worked our way to adding fresh tutorials to our repository which now proudly flaunts a wealth of tutorials and allied articles on topics ranging from progamming languages to web designing to academics and much more.";
        String s2="The journey commenced with a single tutorial on HTML in 2006 \n" +
                "      and elated by the response it generated, we worked our way to adding fresh \n" +
                "      tutorials to our repository which now proudly flaunts a wealth of tutorials \n" +
                "      and allied articles on topics ranging from programming languages to web designing \n" +
                "      to academics and much more.";

        Paragraph paragraph=new Paragraph(s1);
        Paragraph paragraph1=new Paragraph(s2);
        document.add(paragraph);
        document.add(paragraph1);
        document.close();
    }
}
