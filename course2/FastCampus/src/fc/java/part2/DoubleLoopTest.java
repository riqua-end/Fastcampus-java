package fc.java.part2;

import java.sql.SQLOutput;

public class DoubleLoopTest {
    public static void main(String[] args) {

        // 이중 for 문 , 반복문 안에 또 다른 반복문이 오는 경우

        // 이중 반복문을 이용하여 구구단을 출력하세요.
        for (int i = 2; i <=9 ; i++) {
            System.out.print(i+"단"+"\t\t");
        }
        System.out.println();
        for (int i = 1; i <=9; i++) {
            for (int j = 2; j <=9; j++){
                System.out.print(j+"X"+i +"="+(j*i)+"\t");
            }
            System.out.println();
        }


    }
}
