package fc.java.course2.part1;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String str = "Hello World Java";
//        String[] strArray = str.split(",");

//        String[] strArray = str.split("\\s+");
        System.out.print("문자열을 입력하세요.");
        String str = scanner.nextLine();
        // split은 문자열에서 특정 구분자를 기준으로 분리해주는 메서드
        // \\s+는 정규표현식으로 하나 이상의 공백 문자를 나타내는 표현식
        String[] strArray = str.split("\\s+");
        for (String s :
                strArray) {
            System.out.println(s.toString());
        }
    }
}
