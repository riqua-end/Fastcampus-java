package fc.java.course2.part2;

import fc.java.model2.A;
import fc.java.model2.AverageCalculator;

public class GenericLimitTest {
    public static void main(String[] args) {
        //자바 제네릭에서 제한된 타입 파라미터
        //배열 요소의 합의 평균 구하기
        Integer[] integers = {1,2,3,4,5};
        Double[] doubles = {1.0,2.0,3.0,4.0,5.0};

        AverageCalculator<Integer> integerAverageCalculator = new AverageCalculator<>(integers);
        double integerAverage = integerAverageCalculator.calculateAverage();
        System.out.println(integerAverage);

        AverageCalculator<Double> doubleAverageCalculator = new AverageCalculator<>(doubles);
        double doubleAverage = doubleAverageCalculator.calculateAverage();
        System.out.println(doubleAverage);
    }
}
