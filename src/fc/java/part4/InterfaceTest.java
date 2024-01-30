package fc.java.part4;

import fc.java.poly.Radio;
import fc.java.poly.RemoCon;
import fc.java.poly.TV;

public class InterfaceTest {
    public static void main(String[] args) {
        // 리모콘으로 Radio와 Tv를 동작시켜보자.
        RemoCon remo = new Radio();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet(); // ? - 오동작, 부모클래스를 추상클래스로 만들었기 때문에 오동작

        remo=new TV();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();
    }
}
