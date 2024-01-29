package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class PolyMethodTest {
    public static void main(String[] args) {

        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);
    }

//    // Overloading
//    public static void display(Dog d){
//        d.eat();
//    }
//
//    public static void display(Cat c){
//        c.eat();
//    }

    // 다형성 인수
    // 하나의 타입으로 여러 가지 타입을 받을 수 있다 (부모이기 때문에)
    public static void display(Animal ani){
        ani.eat();

        // Cat 타입으로 받은 경우에만 실행 -> if문
        if(ani instanceof Cat){
            ((Cat)ani).night();
        }
    }
}
