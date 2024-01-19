package programmers.coding.test;

public class 피자나눠먹기1 {

    // 문제 설명
    // 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
    // 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
    class Solution {
        public int solution(int n) {
            int answer = (n / 7) + (n % 7 > 0 ? 1 : 0);
            return answer;
        }
    }

    /*  n이 1일 때
    *   (1 / 7)은 정수 나눗셈이므로 0
        (1 % 7 > 0 ? 1 : 0)은 나머지가 0보다 크면 1, 그렇지 않으면 0.
    *   여기서 1 % 7은 1이므로 조건은 참이 되고, 따라서 1이 반환됨.

    *
    * */

}
