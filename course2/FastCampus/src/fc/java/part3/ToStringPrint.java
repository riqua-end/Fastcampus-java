package fc.java.part3;

import fc.java.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        // Q. 생성자 메서드를 통해 PersonVO 객체에 원하는 이름, 나이, 전화번호를 저장하고 toString() 메서드로 출력하세요.
        PersonVO vo = new PersonVO("홍길동",34,"010-1234-1234");
        System.out.println(vo.getAge() + vo.getName() + vo.getPhone());
        System.out.println(vo.toString()); // toString() 은 아래처럼 생략 가능
        System.out.println("vo = " + vo); // 객체가 가지고 있는 모든 데이터를 출력 , 컴파일러가 vo.toString() 를 찾아서 출력
    }
}
