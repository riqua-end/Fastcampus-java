package fc.java.part3;

public class StaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // a+b=?
        int sum = StaticTest.hap(a,b);
        System.out.println("sum = " + sum);
    }
    // Q. 매개변수로 2개의 정수를 입력받아서 총합을 구하여 리턴하는 메서드를 정의하세요.
    public static int hap(int a, int b){
        int sum = a+b;
        return sum;
    }
}

/* <main>클래스가 실행되는 과정
*   1. JVM이 실행할 클래스를 찾는다.
*   2. static 키워드가 붙어있는 멤버들을 정해진 메모리(static-zone) 위치에 한번 자동 로딩됨
*   3. JVM이 static-zone 에서 main() 메서드를 호출
*   4. 호출된 메서드를 Call Stack Frame Area 에 push 한 뒤 동작을 시작
*
*   LIFO ( Last In First Out ) 구조
*   Call Stack Frame Area 는 메서드가 호출되면 호출된 기계어 코드가 push되고 실행되는 메모리 공간*/