package kr.covid.scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CovidStatusMain {
    public static void main(String[] args) {
        // 크롤링할 웹 페이지의 URL
        String url = "https://ncov.kdca.go.kr/bdBoardListR.do?brdId=1&brdGubun=11";

        try {
            // 웹 페이지에서 HTML 문서를 가져옴
            Document document = Jsoup.connect(url).get();

            // 원하는 데이터를 포함하고 있는 테이블을 찾음
            Element table = document.select("table.num").first();

            // 테이블의 모든 행을 선택
            Elements rows = table.select("tbody > tr");

            // 각 주간 양성자 수를 저장할 리스트 생성
            List<CovidStatus> covidStatusList = new ArrayList<>();

            // 각 행을 순회하면서 주간 양성자 수 데이터 추출
            for (Element row : rows) {
                // 카테고리(구분) 추출
                String category = row.select("th").text();
                // 주간 양성자 수를 저장할 리스트 생성
                List<Integer> weeklyPositiveCasesList = new ArrayList<>();

                // 각 열을 순회하면서 주간 양성자 수 데이터 추출
                Elements elements = row.select("td");
                for (Element element : elements) {
                    // 주간 양성자 수 데이터를 정수로 변환하여 리스트에 추가
                    int weeklyPositiveCases = Integer.parseInt(element.text().replaceAll(",", ""));
                    weeklyPositiveCasesList.add(weeklyPositiveCases);
                }

                // 주간 양성자 수 데이터를 CovidStatus 객체로 생성하여 리스트에 추가
                CovidStatus status = new CovidStatus(category, weeklyPositiveCasesList);
                covidStatusList.add(status);
            }
            for (CovidStatus covidStatus : covidStatusList){
                System.out.println(covidStatus);
            }

            // PDF 파일로 저장
            String pdfFileName = "covid_status.pdf";
            PdfExporter.exportToPdf(covidStatusList,pdfFileName);
            System.out.println("PDF 파일 저장 완료 : " + pdfFileName);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
