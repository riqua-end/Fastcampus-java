package programmers.coding.test;

import java.util.Arrays;
public class 중앙값구하기 {

//    문제 설명
//    중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
//    예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
//    단 array의 길이는 홀수입니다.


    class Solution {
        public int solution(int[] array) {
            // 결과값을 저장할 변수 초기화
            int answer = 0;

            // 배열을 오름차순으로 정렬
            Arrays.sort(array);

//             중앙값 계산
//             예를 들어, 배열이 [1, 2, 7, 10, 11]로 정렬되어 있다고 가정하고
//
//             배열의 길이는 5이므로, array.length / 2는 2가 됨.
//             따라서 array[2]는 정렬된 배열에서 중앙에 위치한 값
//             결과적으로 answer에는 7이 할당되어 중앙값이 됨.

            answer = array[array.length / 2];

            // 최종적인 중앙값 반환
            return answer;
        }
    }

}
