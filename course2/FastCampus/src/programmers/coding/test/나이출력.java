package programmers.coding.test;

public class 나이출력 {
    /*  문제 설명
        머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.
    * */
    class Solution {
        public int solution(int age) {
            int answer = 0;
            int year = 2022;
            answer = (year+1)-age;
            return answer;
        }
    }
}
