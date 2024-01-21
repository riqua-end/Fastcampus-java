package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        // Q. 생성자 메서드를 통해 PersonVO객체에 이름,나이,전화번호를 저장하고 출력하세요.
        // 기본 생성자로 초기화
        PersonVO vo = new PersonVO();

        System.out.println(vo.getAge()+"\t"+vo.getPhone()+"\t"+vo.getName());

        PersonVO vo1 = new PersonVO();

        System.out.println(vo1.getAge()+"\t"+vo1.getPhone()+"\t"+vo1.getName());


    }
}
