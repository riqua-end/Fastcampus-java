public class ForLoopTest {
    public static void main(String[] args) {

        // for 문, foreach 문
        // 일반적으로 반복하는 횟수가 정해진 경우에 사용
        // 초기식,조건식,증감식으로 구성되고 세미콜론으로 구분
        // 초기식은 처음 한 번만 수행
        // 이후 , 조건식 -> 반복할 문장 -> 증감식 이 반복적으로 수행됨.

        // Q.반복문을 이용하여 알파벳 대문자와 아스키 코드 값을 출력하세요.

        for (char c = 'A'; c <='Z' ; c++) {
            System.out.println(c+":"+(int)c);
        }

        // 소문자

        for (char c = 'a'; c <= 'z' ; c++) {
            System.out.println(c+" = " + (int)c);
        }

        //int 형으로 출력
        for (int i = 65; i <=90 ; i++) {
            System.out.println((char)i+" = " + i);
        }

        // Q. int[] numbers = {1,2,3,4,5,6,7,8,9,10}; 배열 원소를 향상된 for문으로 출력하세요

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // foreach 문으로 출력.
        for (int num :
                numbers) {
            System.out.println(num);
        }

    }
}
