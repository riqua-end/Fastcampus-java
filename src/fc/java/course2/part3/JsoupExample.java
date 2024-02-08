package fc.java.course2.part3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupExample {
    public static void main(String[] args) {
        // Jsoup API 를 이용해서 웹 크롤링
        // 크롤링 할 URL
        String url = "https://sum.su.or.kr:8888/bible/today?base_de=2024-02-08";

        // 예외처리
        try {
            Document document = Jsoup.connect(url).get(); // url과 연결, get방식으로 요청 , Connection 객체를 사용하여 Document 타입으로 반환

            // HTML div 클래스의 id에 해당하는 요소를 찾아서 Element 객체로 반환
            Element dailybibleInfo = document.getElementById("dailybible_info");
            Element bibleText = document.getElementById("bible_text");
            Element bibleinfoBox = document.getElementById("bibleinfo_box");

            System.out.println("dailybibleInfo = " + dailybibleInfo.text());
            System.out.println("bibleText : " + bibleText.text());
            System.out.println("bibleInfoBox = " + bibleinfoBox.text());

            // CSS 선택자와 일치하는 모든 요소를 찾아서 Elements(복수의 Element) 객체로 반환
            Elements num = document.select(".num");
            Elements info = document.select(".info");

            // 반복문을 사용해서 num과info의 text만 출력
            for (int i = 0; i < num.size(); i++) {
                System.out.println(num.get(i).text()+ " : " + info.get(i).text());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
