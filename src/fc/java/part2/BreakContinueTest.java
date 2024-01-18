package fc.java.part2;

public class BreakContinueTest {
    public static void main(String[] args) {

        // break, continue 제어문  - 반복문의 실행 상태를 직접 제어하고자 break문과 continue문을 사용한다.
        // break문 - 현재 사용중인 반복문을 중단하고 제어를 반복문 바깥으로 이동
        // continue - 현재 수행중인 반복문에서 현재 조건값에 대한 처리를 중단하고, 다음 조건 값에 대한 처리를 수행

        // Q. char[] c = {'s','h','u','t','d','o','w','n'}; 위 배열의 값을 출력 중 'o'라는 문자를 만나면 반복을 중지하세요

        char[] c = {'s','h','u','t','d','o','w','n'};
        for (int i = 0; i < c.length; i++){
            if (c[i]=='o'){
                break;
            }
            System.out.print(c[i]);
        }

        System.out.println();
        // Q. 1~ 10까지의 수 중 3의 배수의 개수를 구하여 출력하세요.
        int count = 0;
        for (int i = 1; i <=10 ; i++) {
            if (i%3!=0){
                continue; // 3의 배수가 아닐 때에만 for문으로 이동
            }
            count++; //3의 배수일 때만 count 됨
        }
        System.out.println(count);
    }
}
