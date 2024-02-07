package fc.java.course2.part2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamAPITest {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        // 짝수의 원소만 구해서 더해라.
//        int even = 0;
//        for (int num : numbers) {
//            if (num % 2 == 0) {
//                even+=num;
//            }
//        }
//        System.out.println("even = " + even);

//        IntStream stream = Arrays.stream(numbers);
        // 배열을 스트림으로 변환 -> Arrays.stream() 메서드를 사용
        // numbers배열을 스트림으로 변환한 뒤 배열의 짝수 원소만 골라 합을 구함
        int sum = Arrays.stream(numbers)
                .filter(n -> n%2 == 0) // n->n%2==0 : 람다식  (중간연산)
                .sum(); // (최종연산)

        System.out.println("sum = " + sum);

        // 스트림을 배열로 변환 -> toArray()메서드를 사용
        // 컬렌션은 collect() 메서드 사용
        // 배열을 스트림으로 변환하고 짝수 원소만 골라 배열로 변환
        int[] evenNumbers = Arrays.stream(numbers)
                .filter(n->n%2==0) //(중간연산)
                .toArray(); // (최종연산)

        for (int even :
                evenNumbers) {
            System.out.println("even = " + even);
        }
    }
}
