import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = scan.nextInt(); //정수 입력
//        float num = scan.nextFloat(); //실수 입력
//        double num = scan.nextDouble(); //실수 입력
        System.out.println("num :" + num);

        System.out.println("문자열을 출력하시오 : ");
        String str = scan.next(); //공백 앞까지 입력 받음
        System.out.println("str = " + str);

        scan.nextLine(); // 스트림 비우기

        System.out.println("문자열을 출력하시오 : ");
        String str1 = scan.nextLine(); //엔터까지 입력 받음
        System.out.println("str = " + str1);
    }

}
