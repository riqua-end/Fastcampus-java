package fc.java.part3;

import fc.java.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        // Q. setter, getter 메서드를 통해 PersonVO객체에 이름, 나이, 전화번호를 저장하고 출력하세요.
        PersonVO vo = new PersonVO();
        // setter로 데이터를 저장
        vo.setAge(50);
        vo.setName("홍길동");
        vo.setPhone("010-1234-1234");

        // getter로 데이터를 얻어옴
        System.out.println(vo.getAge()+"\t"+vo.getName()+"\t"+vo.getPhone());
    }
}
