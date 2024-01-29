package fc.java.poly;

public class Cat extends Animal { // 상속을 통해 수직적 구조로 설계
    // 재정의를 하지 않음
    public void night(){
        System.out.println("밤에 눈에서 빛이 난다.");
    }

    // 재정의 override
    @Override
    public void eat() {
        System.out.println("고양이처럼 먹다.");
    }
}
