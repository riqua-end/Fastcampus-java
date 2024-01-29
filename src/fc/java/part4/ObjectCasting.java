package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class ObjectCasting {
    public static void main(String[] args) {

        // Animal --> Dog,Cat
        // 업캐스팅 방식
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();
        // 다운캐스팅 --> 강제 형변환으로 부모클래스 Animal에서 자식 클래스 Cat클래스에 있는 night()에 접근
        // Override (X)
        // 상위클래스의 타입을 하위 클래스의 타입으로 바꾸는 행위

//        Cat c = (Cat).ani;
//        c.night();
        ((Cat) ani).night();
    }
}
