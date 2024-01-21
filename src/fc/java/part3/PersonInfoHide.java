package fc.java.part3;

import fc.java.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        // Q. 한 사람의 회원 정보를 저장할 객체를 생성하세요.
        PersonVO vo = new PersonVO();
        vo.name="java";
        vo.age=1000; // VO클래스에서 private으로 지정하지 않았기 때문에 정보은닉이 되지 않음.
        vo.phone="010-1234-1234";

        System.out.println(vo.age + "\t" + vo.name + "\t" + vo.phone);
    }
}
