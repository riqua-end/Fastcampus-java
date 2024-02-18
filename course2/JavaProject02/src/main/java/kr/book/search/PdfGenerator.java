package kr.book.search;

import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;
import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import java.io.*;
import java.util.*;
import java.net.MalformedURLException;

/**
 * PdfGenerator 클래스는 도서 목록을 PDF 파일로 생성하는 기능을 제공.
 */
public class PdfGenerator {

    /**
     * 도서 목록을 PDF 파일로 생성하는 메서드입니다.
     *
     * @param books    도서 목록
     * @param fileName 생성할 PDF 파일의 경로 및 이름
     * @throws FileNotFoundException 파일을 찾을 수 없는 경우 예외 발생
     */
    public static void generateBookListPdf(List<Book> books, String fileName) throws FileNotFoundException {
        // PDF 파일 작성을 위한 Writer 객체 생성
        PdfWriter writer = new PdfWriter(fileName);
        // PDF 문서 생성
        PdfDocument pdf = new PdfDocument(writer);
        // PDF 문서 내용을 추가할 Document 객체 생성
        Document document = new Document(pdf);
        // 문서 전체의 폰트 크기 설정
        document.setFontSize(12);

        // 한글 폰트 설정
        PdfFont font = null;
        try {
            // 한글을 지원하는 폰트 malgunsl.ttf를 사용하여 PdfFont 객체 생성
            font = PdfFontFactory.createFont("malgunsl.ttf", PdfEncodings.IDENTITY_H, true);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        // Document에 한글 폰트 설정
        document.setFont(font);

        // 문서 제목 추가
        Paragraph titleParagraph = new Paragraph("도서 목록");
        titleParagraph.setFontSize(24); // 제목 폰트 크기 설정
        titleParagraph.setTextAlignment(TextAlignment.CENTER); // 가운데 정렬
        titleParagraph.setBold(); // 굵게 설정
        document.add(titleParagraph); // 문서에 제목 추가

        // 도서 정보를 표 형태로 표시할 Table 객체 생성
        Table table = new Table(UnitValue.createPercentArray(new float[]{2, 2, 2, 2})); // 각 열의 너비를 설정
        table.setWidth(UnitValue.createPercentValue(100)); // 전체 너비를 테이블에 할당
        table.setMarginTop(20); // 테이블 상단 여백 설정

        // 테이블 헤더 추가
        table.addHeaderCell(createCell("제목", true));
        table.addHeaderCell(createCell("저자", true));
        table.addHeaderCell(createCell("출판사", true));
        table.addHeaderCell(createCell("이미지", true));

        // 도서 정보를 테이블에 추가
        for (Book book : books) {
            // 도서 제목, 저자, 출판사 정보를 각각 테이블에 추가
            table.addCell(createCell(book.getTitle(), false));
            table.addCell(createCell(book.getAuthors(), false));
            table.addCell(createCell(book.getPublisher(), false));

            // 도서 썸네일 이미지를 테이블에 추가
            try {
                // 이미지 데이터 생성
                ImageData imageData = ImageDataFactory.create(book.getThumbnail());
                // 이미지 객체 생성 및 자동 크기 조정
                Image image = new Image(imageData);
                image.setAutoScale(true);
                // 셀에 이미지 추가
                table.addCell(new Cell().add(image).setPadding(5));
            } catch (MalformedURLException e) {
                // 이미지 불러오기 실패 시 메시지 출력
                table.addCell(createCell("이미지 불러오기 실패", false));
            }
        }

        // 문서에 테이블 추가
        document.add(table);
        // 문서 작성 종료
        document.close();
    }

    /**
     * 텍스트 내용을 담은 셀을 생성하는 메서드입니다.
     *
     * @param content  셀에 담을 내용
     * @param isHeader 헤더인지 여부를 나타내는 플래그
     * @return 생성된 Cell 객체
     */
    private static Cell createCell(String content, boolean isHeader) {
        // 담을 내용을 Paragraph로 생성
        Paragraph paragraph = new Paragraph(content);
        // Paragraph를 포함한 Cell 생성
        Cell cell = new Cell().add(paragraph);
        // 셀 내부의 여백 설정
        cell.setPadding(5);
        // 헤더인 경우 배경색, 폰트 크기, 굵기 설정
        if (isHeader) {
            cell.setBackgroundColor(ColorConstants.LIGHT_GRAY); // 배경색 설정
            cell.setFontSize(14); // 폰트 크기 설정
            cell.setBold(); // 굵은 글꼴 설정
        }
        return cell; // 생성된 셀 반환
    }
}
