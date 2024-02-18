package fc.java.part4;

import fc.java.poly.Animal;
import fc.java.poly.Cat;
import fc.java.poly.Dog;

public class AbstractClassTest {
    public static void main(String[] args) {
        // 추상 클래스는 단독으로 객체를 생성 할 수 없다.
//        Animal ani = new Animal(); // cannot be instantiated (객체를 생성할수없다)
        //ani.eat(); // eat();
        //추상클래스는 부모의 역할은 할 수 있다.
        Animal ani = new Dog();
        ani.eat(); // 개처럼 먹다
        ani.move();

        ani = new Cat();
        ani.eat(); // 고양이처럼 먹다
        ani.move();
        ((Cat)ani).night();
    }
}
