package fc.java.course2.part2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCompareTest {
    public static void main(String[] args) {
        // 특정 객체의 인스턴스 메서드 참조
        List<String> names = Arrays.asList("홍길동","김길동","이길동");
        Collections.sort(names,String::compareTo); // String 클래스의 compareTo메서드를 참조

        System.out.println("names = " + names);

        for (String name :
                names) {
            System.out.println("name = " + name);
        }
    }
}
