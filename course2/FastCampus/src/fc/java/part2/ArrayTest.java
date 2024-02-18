package fc.java.part2;

public class ArrayTest {

    public static void main(String[] args) {

        // Q. 실수 5 개를 저장 할 배열을 생성하고 모든 원소에 10을 저장하여 출력하시오.

        float[] f = new float[5];

        f[0] = 10.0f;
        f[1] = 10.0f;
        f[2] = 10.0f;
        f[3] = 10.0f;
        f[4] = 10.0f;

        for (int i = 0;i<f.length;i++) {
            System.out.println(f[i]);
        }

        // Q. 정수 5 개를 아래처럼 배열에 초기화 하고 index 0 번째와 index 3 번째 값을 더하여 출력하시오.

        int[] a = {10,20,30,40,50};

        int sum = a[0]+a[3];
        System.out.println("sum = " + sum);
        System.out.println(a[0]+a[3]);
        System.out.println(a.length); //길이

        // int 의 기본값이 0이기 때문에 초기화를 하면 각각의 index 에 기본값이 메모리에 할당됨

        int[] b = new int[3];
        System.out.println("b[0] = " + b[0]);
        System.out.println("b[1] = " + b[1]);
        System.out.println("b[2] = " + b[2]);

        // Q. 아래 char[] 배열에 APPLE 이라는 문자가 저장되어 있다. 대문자 APPLE 을 소문자 apple 로 출력하시오.

        char[] c = {'A','P','P','L','E'};

        // 형변환을 통해서 int -> char ,대문자를 소문자로 변경
        for (int i = 0; i < c.length; i++) {
            System.out.print((char) (c[i] + 32));
        }

    }

}
