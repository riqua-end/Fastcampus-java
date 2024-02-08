package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.model3.Member;

public class GsonFromJson {
    public static void main(String[] args) {

        String json = "{\"name\":\"홍길동\",\"age\":30,\"email\":\"hi@hi.com\"}";
        // JSON -> Object(Member)
        Gson gson = new Gson();
        Member member = gson.fromJson(json, Member.class);
        System.out.println("member = " + member); // member.toString()
    }
}
