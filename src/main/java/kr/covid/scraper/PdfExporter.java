package kr.covid.scraper;

import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.UnitValue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class PdfExporter {
    // PDF로 내보내기 메서드
    public static void exportToPdf(List<CovidStatus> covidStatusList, String fileName) throws FileNotFoundException {
        try {
            // 한글 폰트 경로
            String koreanFontPath = "C:/Windows/Fonts/malgun.ttf";
            // 한글 폰트 생성
            PdfFont koreanFont = PdfFontFactory.createFont(koreanFontPath, PdfEncodings.IDENTITY_H);

            // PDF 문서 생성
            PdfDocument pdfDocument = new PdfDocument(new PdfWriter(fileName));
            Document document = new Document(pdfDocument);

            // 제목 추가
            Paragraph title = new Paragraph("코로나 바이러스 감염 현황");
            document.add(title.setFont(koreanFont));

            // 테이블 생성
            float[] columnWidths = {100, 50, 50, 50, 50}; // 각 열의 너비
            Table table = new Table(UnitValue.createPercentArray(columnWidths)); // 테이블 생성 및 열 너비 설정

            // 테이블 헤더 추가
            String[] headers = {"구분", "1.14 ~ 1.20", "1.21 ~ 1.27", "1.28 ~ 2.3", "2.4 ~ 2.10"}; // 각 열의 제목
            for (String header : headers) {
                Cell cell = new Cell(); // 셀 생성
                cell.add(new Paragraph(header).setFont(koreanFont)); // 셀에 제목 추가
                cell.setTextAlignment(TextAlignment.CENTER); // 텍스트 정렬 설정
                table.addHeaderCell(cell); // 헤더 셀로 추가
            }

            // 데이터 행 추가
            for (CovidStatus covidStatus : covidStatusList) {
                // 카테고리(구분)를 첫 번째 셀에 추가
                table.addCell(new Cell().add(new Paragraph(covidStatus.getCategory()).setFont(koreanFont).setTextAlignment(TextAlignment.CENTER)));

                // 주간 양성자 수 리스트의 각 요소를 셀에 추가
                List<Integer> weeklyPositiveCasesList = covidStatus.getWeeklyPositiveCasesList();
                for (Integer cases : weeklyPositiveCasesList) {
                    table.addCell(new Cell().add(new Paragraph(String.valueOf(cases)).setFont(koreanFont).setTextAlignment(TextAlignment.CENTER)));
                }
            }

            // 문서에 테이블 추가
            document.add(table);
            // 문서 닫기
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
