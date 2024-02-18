package kr.book.search;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KakaoBookAPI {
    // 카카오 API를 사용하기 위한 API 키
    private static final String API_KEY = "API_KEY"; // REST API Key
    // 카카오 도서 검색 API의 기본 URL
    private static final String API_BASE_URL = "https://dapi.kakao.com/v3/search/book";
    // OkHttpClient 객체 생성
    private static final OkHttpClient client = new OkHttpClient();
    // Gson 객체 생성
    private static final Gson gson = new Gson();

    // 책 검색 메서드
    public static List<Book> searchBooks(String title) throws IOException {
        // API 요청을 위한 URL Builder 생성
        HttpUrl.Builder urlBuilder = HttpUrl.parse(API_BASE_URL).newBuilder();
        // 검색어를 쿼리 파라미터로 추가
        urlBuilder.addQueryParameter("query", title);

        // API 요청을 위한 Request 객체 생성
        Request request = new Request.Builder()
                .url(urlBuilder.build())
                .addHeader("Authorization", "KakaoAK " + API_KEY) // API 인증을 위한 헤더 추가
                .build();

        // API 응답 처리
        try (Response response = client.newCall(request).execute()) {
            // 응답이 성공적으로 받아졌는지 확인
            if (!response.isSuccessful()) {
                // 응답이 실패한 경우 예외 발생
                throw new IOException("Request failed: " + response);
            }

            // 응답 데이터를 JSON 형식으로 파싱
            JsonObject jsonResponse = gson.fromJson(response.body().charStream(), JsonObject.class);
            // 도서 목록에 해당하는 JSON 배열 추출
            JsonArray documents = jsonResponse.getAsJsonArray("documents");

            // 도서 목록을 담을 리스트 생성
            List<Book> books = new ArrayList<>();
            // 각 도서에 대한 정보를 반복적으로 처리
            for (JsonElement document : documents) {
                JsonObject bookJson = document.getAsJsonObject();
                // 도서 정보를 추출하여 Book 객체 생성
                Book book = new Book(
                        bookJson.get("title").getAsString(), // 도서 제목
                        bookJson.get("authors").getAsJsonArray().toString(), // 저자 목록
                        bookJson.get("publisher").getAsString(), // 출판사
                        bookJson.get("thumbnail").getAsString() // 썸네일 이미지 URL
                );
                // 생성된 Book 객체를 도서 목록에 추가
                books.add(book);
            }
            // 완성된 도서 목록 반환
            return books;
        }
    }
}
