package fc.java.part2;

import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {

        // Q. 80점 이상의 학생 중에서 90점 이상은 A반, 85점 이상은 B반 , 그렇지 않으면 C반으로 편성하고 점수가 80미만이면 불합격 처리
        // 단 , 점수는 0~100 사이의 값으로 입력 받는다.
        int score = 90;

        if(score>=0 && score <=100){
            if(score>=90) {
                System.out.println("A반");
            } else if (score>=85) {
                System.out.println("B반");
            } else if (score>=80){
                System.out.println("C반");
            }
            else {
                System.out.println("불합격");
            }
        }
        else {
            System.out.println("유효한 점수가 아닙니다.");
        }
    }
}
