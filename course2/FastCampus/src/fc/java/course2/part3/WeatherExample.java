package fc.java.course2.part3;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherExample {
    public static void main(String[] args) {
        // Open API 날씨 정보 가져오기

        // 발급받은 API Key를 입력합니다.
        String apiKey = ""; // 발급받은 API Key 입력
        String city = "Seoul"; // 날씨를 확인할 도시 이름
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

        try {
            // URL 객체 생성
            URL url = new URL(urlString);
            // HTTP 연결 생성
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            // 요청 방식 설정 (GET 방식)
            connection.setRequestMethod("GET");
            // 요청 헤더 설정 (JSON 형식으로 요청)
            connection.setRequestProperty("Accept", "application/json");
            // HTTP 응답 코드 확인 (200인 경우 성공)
            int responseCode = connection.getResponseCode();
            System.out.println("responseCode = " + responseCode);

            if (responseCode == 200) {
                /*
                BufferedReader 생성: 서버로부터 데이터를 읽어올 때 사용할 BufferedReader 객체를 생성합니다.

                응답 데이터 읽기: 서버로부터 받은 응답 데이터를 한 줄씩 읽어오며, 읽어온 데이터를 content에 추가합니다.

                BufferedReader 닫기: 데이터를 모두 읽은 후에는 BufferedReader를 닫아줍니다. 이렇게 함으로써 사용한 리소스를 해제합니다.

                -------------------------------------------------------------------------------------------------------
                BufferedReader: 이 클래스는 문자 입력 스트림에서 문자를 읽어서 버퍼에 저장하여 문자, 배열 및 줄의 효율적인 읽기를 제공합니다.
                여기서는 BufferedReader 객체인 in을 생성합니다.

                InputStreamReader: 이 클래스는 바이트 스트림에서 문자 스트림으로의 다리 역할을 합니다.
                지정된 문자 집합을 사용하여 바이트를 문자로 디코딩합니다.
                이 코드에서는 HTTP 연결의 입력 스트림에서 얻은 InputStream을 InputStreamReader로 래핑합니다.
                이를 통해 입력 스트림에서 텍스트를 읽을 수 있습니다.

                connection.getInputStream(): 이 메서드는 URL 연결에서 데이터를 읽을 수 있는 InputStream을 반환합니다.
                여기서 connection은 URL에 대한 HTTP 연결을 나타내는 HttpURLConnection 객체입니다.

                응답 읽기: BufferedReader는 readLine() 메서드를 사용하여 서버에서 응답을 한 줄씩 읽습니다.
                읽을 줄이 더 이상 없을 때까지(readLine()이 null을 반환할 때까지) 각 줄은 content 버퍼에 append() 메서드를 사용하여 추가됩니다.

                리더 닫기: 모든 데이터를 읽은 후에는 BufferedReader를 close() 메서드를 사용하여 닫습니다.
                이를 통해 리더와 관련된 리소스가 해제됩니다.

                */

                // 입력 스트림을 통해 데이터 읽기
                // 데이터를 읽어올 BufferedReader 객체 생성
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                // 이 코드는 단일 스레드 환경이므로 StringBuilder를 사용해도 무방하다.
                // 다중 스레드 환경일때를 고려해서 더 안전한 StringBuffer 사용
                StringBuffer content = new StringBuffer(); // 응답 내용을 저장할 StringBuffer 객체 생성

                // 서버로부터 응답 데이터를 한 줄씩 읽어와서 content에 추가
                while ((inputLine = in.readLine()) != null) { // 읽어올 데이터가 없을 때까지 반복
                    content.append(inputLine); // 읽은 데이터를 content에 추가
                }
                in.close(); // BufferedReader 닫기


                // 응답 데이터를 JSON 형식으로 파싱하여 JsonObject 객체로 변환
                JsonObject weatherData = JsonParser.parseString(content.toString()).getAsJsonObject();
                // "main" 키에 해당하는 JSON 객체 추출
                JsonObject mainData = weatherData.getAsJsonObject("main");
                // "temp" 키에 해당하는 값을 double 형태로 가져옴 (온도 정보)
                double temp = mainData.get("temp").getAsDouble();

                // 가져온 온도 정보 출력
                System.out.println("temp = " + temp);

                // 연결 종료
                connection.disconnect();
            } else {
                // 오류 처리
            }
        } catch (Exception e) {
            e.printStackTrace(); // 예외 메시지 출력
        }
    }
}
