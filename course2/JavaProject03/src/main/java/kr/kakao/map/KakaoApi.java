package kr.kakao.map;

import java.io.IOException;
import java.net.URLEncoder;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;

/**
 * KakaoApi 클래스는 Kakao 지도 API를 활용하여 주소의 좌표를 가져오는 기능
 */
public class KakaoApi {
    private static final String KAKAO_API_KEY = "3b07506d0c6083ef634aeafe8b5fc280"; // Kakao REST API Key

    /**
     * 주소를 입력받아 해당 주소의 좌표를 가져오는 메서드입니다.
     *
     * @param address 좌표를 가져올 주소
     * @return 좌표 배열 [latitude, longitude] (경위도)
     * @throws IOException HTTP 요청 중 발생한 예외
     */
    public static double[] getAddressCoordinate(String address) throws IOException {
        // Kakao 주소 검색 API URL
        String apiUrl = "https://dapi.kakao.com/v2/local/search/address.json";
        // 주소를 UTF-8 형식으로 인코딩
        String encodedAddress = URLEncoder.encode(address, "UTF-8");
        // API 요청 URL 생성
        String requestUrl = apiUrl + "?query=" + encodedAddress;

        // HttpClient 객체 생성
        CloseableHttpClient httpClient = HttpClients.createDefault();
        // HTTP GET 요청 객체 생성
        HttpGet httpGet = new HttpGet(requestUrl);
        // 요청 헤더에 API 키 추가
        httpGet.setHeader("Authorization", "KakaoAK " + KAKAO_API_KEY);

        // HTTP GET 요청 실행 및 응답 처리
        try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
            // 응답 본문을 문자열로 변환
            String responseBody = EntityUtils.toString(response.getEntity());
            // Gson 객체 생성
            Gson gson = new Gson();
            // JSON 문자열을 JsonObject로 파싱
            JsonObject jsonObject = gson.fromJson(responseBody, JsonObject.class);
            // documents 배열 추출
            JsonArray documents = jsonObject.getAsJsonArray("documents");

            // documents 배열이 비어있지 않은 경우
            if (documents.size() > 0) {
                // 첫 번째 문서(document) 추출
                JsonObject document = documents.get(0).getAsJsonObject();
                // 좌표 정보 추출 (경위도)
                double latitude = document.get("y").getAsDouble();
                double longitude = document.get("x").getAsDouble();
                // 좌표 배열 반환
                return new double[]{latitude, longitude};
            } else {
                // 검색 결과가 없는 경우 null 반환
                return null;
            }
        }
    }
}
