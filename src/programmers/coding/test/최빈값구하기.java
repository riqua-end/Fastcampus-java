package programmers.coding.test;

public class 최빈값구하기 {

//    최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
//    정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
//    최빈값이 여러 개면 -1을 return 합니다.


    class Solution {
        public int solution(int[] array) {
            //count 배열의 각 인덱스에는 초기값은 0이 들어가 있음.
            int[] count = new int[1001]; // 0부터 1000까지의 값이 등장할 수 있으므로, 각 값의 등장 횟수를 저장할 배열

            // 배열의 값들을 순회하면서 각 숫자의 등장 횟수를 count 배열에 기록
            // num은 각 반복에서 배열의 현재값
            // [1,2,3,3,3,4] 일때 count 배열은 [0,1,1,3,1,0,,,]
            for (int num : array) {
                count[num]++;
            }

            int max = 0; // 최대 등장 횟수를 저장하는 변수 초기화
            int mode = -1; // 최빈값을 저장하는 변수 초기화

            // count 배열을 순회하면서 최빈값 찾기
            for (int i = 0; i < count.length; i++) {
                if (count[i] > max) {
                    max = count[i]; // 최대 등장 횟수 업데이트 , max = 3 , mode = 3 따라서 최빈값은 3
                    mode = i; // 최빈값 업데이트
                } else if (count[i] == max) {
                    mode = -1; // 최빈값이 여러 개인 경우 -1로 설정
                }
            }

            return mode; // 최빈값 반환
        }
    }

}
