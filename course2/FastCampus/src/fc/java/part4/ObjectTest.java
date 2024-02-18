package fc.java.part4;

import fc.java.poly.A;

public class ObjectTest {
    public static void main(String[] args) {
//        A a = new A();
//        a.display();

        Object obj = new A();
        ((A)obj).display(); // Downcasting
    }
}
