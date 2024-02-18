package fc.java.part3;

// Object = 상태정보 와 행위정보로 구성되어 있다. 상태 정보 ( 멤버 변수 ) 행위 정보 ( 멤버 메서드 )
public class Person {

    // 상태 정보 ( 멤버 변수 )
    public String name;
    public int age;
    public String phone;

    // 행위 정보 ( 멤버 메서드 )
    public void play(){
        System.out.println("운동을 한다.");
    }
    public void eat(){
        System.out.println("음식을 먹다.");
    }
    public void walk(){
        System.out.println("걷다.");
    }
}
