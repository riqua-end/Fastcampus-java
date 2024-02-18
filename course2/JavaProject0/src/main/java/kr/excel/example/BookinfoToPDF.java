package kr.excel.example;

import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Year;
import java.util.HashMap;

public class BookinfoToPDF {
    public static void main(String[] args) {

        HashMap<String,String> bookInfo = new HashMap<>();
        bookInfo.put("title","한글 자바");
        bookInfo.put("author","홍길동");
        bookInfo.put("publisher","한글 자바");
        bookInfo.put("year",String.valueOf(Year.now().getValue()));
        bookInfo.put("price","25000");
        bookInfo.put("pages","400");

        try {
            // PDF 생성을 위한 PDFWriter 객체 생성
            PdfWriter writer = new PdfWriter(new FileOutputStream("book_infomation.pdf"));

            // PDFWriter 객체를 사용하여 PDFDocument 객체 생성
            PdfDocument pdf = new PdfDocument(writer);

            // Document 객체 생성
            Document document =new Document(pdf);

            // Font 생성 및 추가
            PdfFont font = PdfFontFactory.createFont("malgunsl.ttf", PdfEncodings.IDENTITY_H,true);

            document.setFont(font);

            // 책 정보를 문단으로 생성하여 Document 에 추가
            for(String key : bookInfo.keySet()){
                Paragraph paragraph = new Paragraph(key + ":" + bookInfo.get(key));
                document.add(paragraph);
            }

            // document 닫기
            document.close();

            System.out.println("PDF 파일 생성 완료");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
