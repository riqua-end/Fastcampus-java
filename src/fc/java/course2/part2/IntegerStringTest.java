package fc.java.course2.part2;

public class IntegerStringTest {
    public static void main(String[] args) {
        String str = "123";
        String str1 = "123";
        System.out.println(str+str1); // "123"+"123" = "123123" => 결합

        // "123"+"123" = 246 (정수)
        int sum = Integer.parseInt(str)+Integer.parseInt(str1);
        System.out.println("sum = " + sum);

        // su1+su2 = "123123"
        int su1 = 123;
        int su2 = 123;

        String su3 = String.valueOf(su1)+String.valueOf(su2);
        System.out.println("su3 = " + su3);
    }
}
