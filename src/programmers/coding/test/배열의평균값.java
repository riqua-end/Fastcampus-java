package programmers.coding.test;

public class 배열의평균값 {
    /*
    *   문제 설명
        정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

        제한사항
        0 ≤ numbers의 원소 ≤ 1,000
        1 ≤ numbers의 길이 ≤ 100
        정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.

    *
    * */

    class Solution {
        public double solution(int[] numbers) {
            double answer = 0;
            for(int i = 0; i < numbers.length;i++){
                answer+=numbers[i]; // 반복문을 통해 numbers 의 각 원소를 더하여 answer에 대입
            }
            return answer/numbers.length; // 각 원소의 합을 numbers의 길이로 나누면 평균값이 구해짐
        }
    }
}
