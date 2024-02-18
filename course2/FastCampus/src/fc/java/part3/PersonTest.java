package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        // Q. 한사람의 데이터를 저장 할 변수를 선언하세요.
//        Person p;

        // Q. 사람의 이름 , 나이, 전화번호를 저장할 [객체를 생성]하세요.
//        p=new Person(); // new 연산자를 사용해 만들어진 객체가 메모리에서 할당된 것을 인스턴스라고 함.

        // Q. 모델링 된 Person클래스를 이용하여 [객체를 메모리에 생성]하세요.
        // [ 인스턴스를 만드는 과정 ]
        Person p = new Person();

        // 객체가 생성된 후 멤버에 접근하는 방법
        // dot연산자로 접근한다.
        p.age=10;
        p.name="홍길동";
        p.phone="010-1234-1234";

        System.out.println(p.age);
        System.out.println(p.name);
        System.out.println(p.phone);

        p.eat();
        p.play();
        p.walk();

    }
}

/*
*       *생성자 메서드 와 this
*       -'생성자 메서드'는 객체를 메모리에 생성하는 역할을 한다.
*       -기본 생성자는 생략 ( 모든 클래스에는 기본 생성자가 포함되어 있다 )
*       -new 연산자에 의해 호출된다.
*       -자신이 가지고 있는 멤버들을 메모리에 올려 객체를 생성하는 역할
*       -메서드의 이름은 클래스의 이름과 동일해야 한다
*       -접근제한자가 public인 경우에만 호출
*       -객체의 초기화를 위해서 생성된다.
*       -리턴 타입이 없다.
*
*       *this ? '자기 자신을 가리키는 객체 변수' ( 참조 변수, 포인터 변수 )
*
* */