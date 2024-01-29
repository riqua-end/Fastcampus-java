package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class PolyArrayTest {
    public static void main(String[] args) {

        // 다형성 배열 활용
        Dog d = new Dog();

        Cat c = new Cat();
        // Dog,Cat 을 저장할 배열을 생성하세요.
        // 다형성 배열 - 배열은 동일한 자료형만 저장 가능하지만 부모타입의 배열은 자식 타입을 저장 가능하다
        // 하나의 배열에 서로 다른 타입을 저장 가능
        Animal[] ani = new Animal[2];
        ani[0] = d;
        ani[1] = c;

        display(ani);
    }

    public static void display(Animal[] ani){
        for (int i = 0; i < ani.length; i++) {
            ani[i].eat(); // ani[0] = Dog, ani[1] = Cat
            if(ani[i] instanceof Cat){
                ((Cat)ani[i]).night();
            }
        }
    }
}
