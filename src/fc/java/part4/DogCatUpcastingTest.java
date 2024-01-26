package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        // Dog 객체를 사용해보자
        //Dog d = new Dog();
        //d.eat();

        // Upcasting
        // 부모가 자식을 가리킨다.
        Animal ani = new Dog();
        ani.eat(); // 동물처럼 먹다 -> 개처럼 먹다

        ani = new Cat();
        ani.eat(); // 동물처럼 먹다 -> 고양이 처럼 먹다
    }
}
