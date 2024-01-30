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
