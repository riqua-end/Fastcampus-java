package programmers.coding.test;

public class 짝수는싫어요 {

    // 문제 설명
    //정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

    class Solution {
        public int[] solution(int n) {
            // 배열의 크기를 정의. 홀수의 개수에 맞춰야 함.
            int[] answer = new int[(n + 1) / 2];

            // 배열에 추가할 홀수 값을 나타내는 변수 초기화
            int num = 1;

            // 배열에 홀수를 추가하기 위한 for 루프
            for (int i = 0; i < answer.length; i++) {
                // 현재 홀수 값을 배열에 저장
                answer[i] = num;

                // 다음 홀수 값으로 업데이트 (2씩 증가시켜 다음 홀수를 얻음)
                num += 2;
            }

            // 최종적으로 홀수가 저장된 배열을 반환
            return answer;
        }
    }
//      예를 들어 n이 7일 경우

//      int[] answer = new int[(n + 1) / 2];: n이 7이므로, (7 + 1) / 2는 4입니다. 따라서 배열 answer는 길이가 4가 됩니다.
//
//      int num = 1;: 변수 num은 1로 초기화됩니다.
//
//      for (int i = 0; i < answer.length; i++) {: for 루프를 시작합니다. i는 0부터 시작하며, answer.length는 4입니다.
//
//      answer[i] = num;: 현재 num 값을 배열 answer에 저장합니다. 첫 번째 루프에서는 answer[0] = 1이 됩니다.
//
//      num += 2;: num을 2씩 증가시킵니다. 이제 num은 3이 됩니다.
//
//      answer[i] = num;: 다시 num 값을 배열 answer에 저장합니다. 두 번째 루프에서는 answer[1] = 3이 됩니다.
//
//      루프가 끝날 때까지 위 과정을 반복하면, 최종적으로 배열 answer는 [1, 3, 5, 7]이 됩니다.
//



    }
