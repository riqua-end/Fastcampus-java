package fc.java.course2.part2;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
    public static void main(String[] args) {
        // HashSet을 이용하여 배열에서 중복되지 않은 숫자 구하기
        int[] nums={1,2,3,4,5,2,4,6,7,1,3};

        //HashSet 객체 생성
        Set<Integer> uniqueNums = new HashSet<>();

        //중복되지 않은 숫자들을 HashSet에 추가
        for (int number :nums) {
            uniqueNums.add(number);
        }

        System.out.println("Unique numbers....");

        //중복되지 않은 숫자들 출력
        for (int number :
                uniqueNums) {
            System.out.println(number);
        }
    }
}
