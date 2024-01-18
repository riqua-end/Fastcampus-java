package fc.java.part2;

public class OverloadingTest {
    public static void main(String[] args) {

        // Overloading 은 하나의 클래스 안에서 동일한 이름의 메서드를 여러개 사용할 수 있는 객체지향기법
        // 동작이 비슷하기 때문에 메서드 이름을 같게 만들어 사용하면 편리하다.
        // 오버로딩의 전제 조건 -> 메서드의 시그니처가 달라야한다.
        // 매개변수의 개수, 매개변수의 타입

        // 정적 바인딩이란? 컴파일 시점에서 사용될(호출될) 메서드가 결정(연결)되는 바인딩
        // 밑의 add메서드는 컴파일 시점에서 사용될 메서드가 add_int_int(10,50);
        // add_float_float(34.5f,56.5f); 이런 식으로 내부적으로 결정 됨

        // 따라서 메서드의 오버로딩의 실행 속도하고는 상관 없다.


        float v = add(35.6f,56.7f);
        System.out.println("v = " + v);

        int vv = add(10,50);
        System.out.println("vv = " + vv);
    }
    // Q. 매개변수로 두 개의 정수 값을 받아서 /총합을 구하여 /리턴하는 /메서드를 정의 하세요.

    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    // Q. 매개변수로 두 개의 실수 값을 받아서 /총합을 구하여 /리턴하는 /메서드를 정의 하세요.

    public static float add(float a, float b){
        float sum = a + b;
        return sum;
    }

}
