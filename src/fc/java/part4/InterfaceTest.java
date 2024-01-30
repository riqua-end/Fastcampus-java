package fc.java.part4;

import fc.java.poly.Radio;
import fc.java.poly.RemoCon;
import fc.java.poly.TV;

public class InterfaceTest {
    public static void main(String[] args) {
        // 리모콘으로 Radio와 Tv를 동작시켜보자.
        // 다형성이 100% 보장이 된다.
        // 부모가 인터페이스면 자식의 내부 동작 방식을 전혀 몰라도 동작을 시킬수가 있다.
        // RemoCon r = new RemoCon(); 객체 생성 불가
        // 부모의 역할은 할 수 있다.
        RemoCon remo = new Radio();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet(); // 인터페이스로 다형성이 100% 보장됨

        remo=new TV();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();
    }
}

/*
*           << 추상 클래스 >>
        1.다형성을 보장하기 위해 등장
    *   2.서로 비슷한 클래스의 공통 부분을 묶을 때 사용
    *   3.단독으로 객체를 생성 할 수 없다.
    *   4.부모의 역할로 사용된다.(Upcasting)
    *   5.구현된 메서드를 가질 수 있다.
    *
    *       << 인터페이스 >>
        1.100% 추상 메서드로만 이루어져 있다.
    *   2.다형성을 100% 보장
    *   3.서로 다른 클래스의 공통 부분을 묶을 때 사용
    *   4.단독으로 객체 생성 불가
    *   5.추상메서드와 final static 상수만 올 수 있다.
    *   6.구현된 메서드를 가질 수 없다.
    *   7.다중 상속을 지원
    *
    *           <공통점>
            1.다형성 보장
        *   2.추상 메서드를 가질 수 있다.
        *   3.단독으로 객체 생성 불가
        *   4.부모의 역할로 사용 (Upcasting)
        *
        *       <차이점>
            -서로 비슷한 클래스의 공통 부분을 묶을 때 사용 : 추상 클래스
            * (추상 메서드와 구현 메서드)
            -서로 다른 클래스의 공통 부분을 묶을 때 사용 : 인터페이스
            * (추상 메서드와 final static 상수를 가질 수 있다)
* */