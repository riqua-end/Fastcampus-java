package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Q. 생성자 메서드를 통해 PersonVO 객체에 원하는 이름, 나이, 전화번호를 저장하고 출력하세요.

        // 개발자가 원하는 값으로 초기화를 하는 방법?
        // - 생성자 메서드를 overloading 해서 초기화 가능

        PersonVO vo = new PersonVO(); // default 생성자
        PersonVO vo1 = new PersonVO("나길동",60,"010-1111-1234");
        PersonVO vo2 = new PersonVO("다길동",70,"010-1221-1234");

        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());
        System.out.println(vo1.getName()+"\t"+vo1.getAge()+"\t"+vo1.getPhone());
        System.out.println(vo2.getName()+"\t"+vo2.getAge()+"\t"+vo2.getPhone());
    }
}
