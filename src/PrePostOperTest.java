public class PrePostOperTest {
    public static void main(String[] args) {

        //증가 연산자, 감소 연산자 ++,--

        int x = 10;
        System.out.println(--x); // 9
        System.out.println(x++); // 9 (10)
        System.out.println(x--); // 10 (9)
        System.out.println(++x); // 10 (9+1)
        System.out.println(x);   //10

        //삼항 연산자 (조건식) ? A : B , 조건식이 참(true)이면 A, 거짓(false)면 B

        //삼항 연산자를 이용하여 정수 2개 중 max value와 min value 를 출력하세요.

        int a = 10;
        int b = 20;

        //min value
        int min = (a<b) ? a : b;
        System.out.println("min = " + min);

        //max value
        int max = (a>b) ? a: b;
        System.out.println("max = " + max);


    }
}
