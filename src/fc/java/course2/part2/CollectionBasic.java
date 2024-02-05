package fc.java.course2.part2;

import fc.java.poly.A;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        // ArrayList에 10,20,30,40,50 5개의 정수(int)를 저장하고 출력하세요.
        // ArrayList -> Object[] <---X-- int
        // ArrayList -> Object[] <---O-- Integer(Wrapper)
        // ArrayList -> Object[] <---O-- (Auto-boxing:Integer) -- int

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // list.add(new Integer(10)); , Auto-boxing
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // int <- (Auto-boxing) -- Integer
        for (int data :
                list) {
            System.out.println("data = " + data);
        }
    }
}
