package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.model3.Member;

public class GsontoJson {
    public static void main(String[] args) {

        Member member = new Member("홍길동",30,"hi@hi.com");

        // Json -> { "name" : "홍길동" , "age" : 30, "email" : "hi@hi.com"}
        Gson gson = new Gson();
        // Object(Member) -> JSON 으로 변환
        String json = gson.toJson(member);
        System.out.println("json = " + json);

    }
}
