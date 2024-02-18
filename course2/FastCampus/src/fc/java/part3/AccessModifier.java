package fc.java.part3;

import fc.java.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO dto = new MemberDTO();
        dto.name="홍길동";
        dto.phone="010-1234-1234";
        //dto.age 는 MemberDTO에서 private로 되어있어서 접근 불가로 에러
        System.out.println(dto.name+"\t"+dto.phone);

        dto.play();
    }
}
