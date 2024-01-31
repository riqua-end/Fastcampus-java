package fc.java.course2.part1;

import fc.java.model2.MinMaxFinder;

public class MinMaxFinderTest {
    public static void main(String[] args) {
        // 정수형 배열의 최소값,최대값 구하기
        int[] arr = {5,3,9,1,7};
        int min = MinMaxFinder.findMin(arr);
        int max = MinMaxFinder.findMax(arr);

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
