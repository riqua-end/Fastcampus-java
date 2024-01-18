package fc.java.part2;

public class MethodMakeTest {
    public static void main(String[] args) {

        // Method의 결과 값은 하나의 형태로 만들어진다.
        // 변수는 데이터를 하나의 형태로 저장한다.
        // 메서드의 이름이 변수 역할을 한다.

        int x = 3;
        int y = 5;

        // add라는 메서드를 호출하여 두 수의 합의 결과를 받아보자.

        int result = add(x,y);

    }
    // Q. 매개변수로 2개의 정수를 받아서 총합을 구하여 리턴하는 메서드를 정의하세요.
    public static int add(int x, int y) { // main메서드의 접근 제한자가 static이므로 static을 붙여야함
        int sum = x + y;
        return sum;
    }
}
