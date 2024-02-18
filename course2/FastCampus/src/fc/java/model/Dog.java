package fc.java.model;

public class Dog extends Animal{ // 상속을 통해서 수직적 구조로 설계

//    public Dog(){
//        super(); // new Animal()의 생성자를 호출함, super()는 첫번째 문장에 나와야함
////        int a = 10;
//    }

    @Override
    public void eat() {
        System.out.println("개처럼 먹다");
    }
}
