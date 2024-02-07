package fc.java.course2.part2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamExample {
    public static boolean isEven(int number){
        return number%2==0;
    }
    public static void main(String[] args) {
        // *** List에 저장된 정수들의 짝수 여부를 판별하고,짝수들만 필터링하여 정렬하고, 각 숫자를 제곱한 후 모든 숫자의 합을 계산 ***

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Predicate<T>를 사용해 짝수 여부를 판별하는 람다 표현식을 정의
        Predicate<Integer> isEven = n -> n%2 == 0;

        int sumOfSquares = numbers.stream()
//                .filter(isEven) // 함수형 인터페이스 Predicate를 사용해서 짝수만 필터링
                .filter(StreamExample::isEven) //메서드 참조 방식
                .sorted() // 정렬
                .map(n->n*n) // 주어진 함수를 스트림의 모든 원소에 적용한 결과로 새로운 스트림을 생성
                .reduce(0,Integer::sum); // 스트림의 요소를 결합하여 하나의 결과 값을 생성하는데 사용

        System.out.println("sumOfSquares = " + sumOfSquares);
    }
}
