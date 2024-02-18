package fc.java.part2;

public class ApiOverloading {
    public static void main(String[] args) {
        // println() 메서드가 오버로딩 되어있다.
        System.out.println(10);
        System.out.println(11.1f);
        System.out.println('a');
        System.out.println("A");
        System.out.println("APPLE");

        //메서드의 호출
        int max = maxValue(7,9);
        System.out.println("max = " + max);

        int min = minValue(3,8);
        System.out.println("min = " + min);
    }
    // 사용자 정의 메서드
    // Q. 두 개의 정수를 매개변수로 받아서 더 큰 수를 리턴하는 메서드를 정의하세요.

    public static int maxValue(int a,int b){
        return (a>b) ? a :b;
    }

    // Q. 두 개의 정수를 매개변수로 받아서 더 작은 수를 리턴하는 메서드를 정의하세요.
    public static int minValue(int a, int b){
        return (a<b) ? a : b;
    }



}
