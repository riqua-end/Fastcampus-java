package fc.java.part4;

import fc.java.model.Cat;
import fc.java.model.Dog;

public class DogCatTest {
    // Dog객체를 생성하고 eat() 동작을 구동해보자.
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); // 수평적 구조로 만들어서 중복이 발생

        // Cat 객체를 생성하고 eat(), night() 동작을 구동해보자.
        Cat c = new Cat();
        c.eat(); // 수평적 구조로 만들어서 중복이 발생
        c.night();
    }
}
