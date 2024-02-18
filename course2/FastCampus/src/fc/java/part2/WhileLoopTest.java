package fc.java.part2;

public class WhileLoopTest {
    public static void main(String[] args) {
        // 0~5 까지의 수를 출력하세요.
        int i = 0;
        while (i<=5){
            System.out.println(i);
            i++;
        }

        // Q. int[] numbers = { 1,2,3,4,5,6,7,8,9,10 }; 주어진 배열의 모든 원소를 출력하세요.
        int[] numbers = { 1,2,3,4,5,6,7,8,9,10 };

        i=0;
        while (i<numbers.length){
            System.out.println(numbers[i]);
            i++;
        }

        System.out.println(i);


        System.out.println("do~ while문");

        // do ~ while 문 , 반복할 문장을 실행한 수에 조건식 검사
        // 반복문 내에 있는 문장을 최소한 한 번 실행하고자 할 때 유용
        // 마지막에 세미콜론 ; 을 반드시 써야함

        // 0~5 까지의 숫자를 출력하세요

        i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i<=5);

        System.out.println("do~while문 테스트");
        // Q. 1~10까지 출력하는 프로그램을 while 과 do~ while문으로 작성하세요

        i = 0;
        do {
            System.out.println(numbers[i]);
            i++;
        }
        while (i< numbers.length);
    }
}
