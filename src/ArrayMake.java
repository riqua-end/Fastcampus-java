import java.awt.print.Book;
import java.util.Arrays;

public class ArrayMake {
    public static void main(String[] args) {

        // Q. 정수 5개를 저장 할 배열을 생성 하시오.

        int[] a = new int[5];

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        System.out.println(a.length);
        // 반복문 ( for, while )
        for (int i = 0;i<a.length;i++) {
            System.out.println("i = " + a[i]);
        }

        float[] f = new float[5]; // 길이가 고정

        Book b1,b2,b3;
        Book[] b = new Book[3]; // 책 3권을 저장할 배열 (객체 배열)


    }
}
