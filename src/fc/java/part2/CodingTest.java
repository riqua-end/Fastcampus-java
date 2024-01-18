package fc.java.part2;

class CodingTest {
    public static void main(String[] args) {

        //프로그래머스 분수의 덧셈*********

        //첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
        //두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

        //입출력 예 #1
        //
        //1 / 2 + 3 / 4 = 5 / 4입니다. 따라서 [5, 4]를 return 합니다.
        //입출력 예 #2
        //
        //9 / 2 + 1 / 3 = 29 / 6입니다. 따라서 [29, 6]을 return 합니다.


        class Solution {
            public int[] solution(int numer1, int denom1, int numer2, int denom2) {

                int a = numer1 * denom2 + numer2 * denom1; // 두 분수의 분자
                int b = denom1 * denom2; // 두 분수의 분모

                int max = 1; // 최대 공약수의 초기값

                // 최대 공약수를 구하는 범위
                for (int i = 1; i <= a && i <= b; i++) {
                    // 두 수가 모두 i로 나누어 떨어진다면, i가 두 수의 공약수임을 의미
                    if (a % i == 0 && b % i == 0) {
                        max = i; // 두 수의 공약수 중에서 가장 큰 공약수 (즉, 최대 공약수)가 저장됨.
                    }
                }

                // answer 배열에 최대 공약수를 사용하여 기약분수로 만든 결과를 배열에 저장
                // 'a/max'는 분자를 최대 공약수로 나눈 값이 되고, 'b/max'는 분모를 최대 공약수로 나눈 값
                int[] answer = {a / max, b / max};

                return answer;
            }

        }
    }
}