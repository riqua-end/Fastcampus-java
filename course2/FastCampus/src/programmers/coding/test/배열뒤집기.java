package programmers.coding.test;

public class 배열뒤집기 {
    /*  문제 설명
        정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
        num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.

*/
    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[num_list.length];
            for(int i=0;i<num_list.length;i++){
                answer[i]=num_list[num_list.length-i-1];
            }
            return answer;
        }
    }
}

/*  num_list = {1,2,3,4,5} 라고 한다면
*   answer[0] = num_list[5-0-1]; //5
*   answer[1] = num_list[5-1-1]; //4
*   answer[2] = num_list[5-2-1]; //3
*   answer[3] = num_list[5-3-1]; //2
*   answer[4] = num_list[5-4-1]; //1
* */