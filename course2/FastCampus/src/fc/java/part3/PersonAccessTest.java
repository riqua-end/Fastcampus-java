package fc.java.part3;

public class PersonAccessTest {
    public static void main(String[] args) {

        // Q. Person 클래스에 이름, 나이 ,전화번호를 저장하고 출력하세요.
        Person person = new Person();
        person.name="홍길동";
        person.age=1000; // 접근제어자가 public 이라서 잘못된 값이라도 접근이 허용되어있음
        person.phone="010-1234-1234";

        System.out.println(person.name + person.phone + person.age);
    }
}

/*
*   접근 제어자의 종류
*
*   public , private, protected , default
*
*   public = 모든 패키지에서 접근 가능,모든 클래스는 public , 모든 멤버메서드는 public
*
*   private = 모든 패키지에서 접근 불가능 , 자기 자신만 접근 가능 , 모든 멤버 변수는 private
*
*   protected = 상속 관계에서 하위클래스에서 상위클래스 접근 가능
*
*   default = 동일한 패키지에서만 접근 가능
*
* */
