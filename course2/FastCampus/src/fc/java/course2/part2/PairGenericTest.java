package fc.java.course2.part2;

import fc.java.model2.Pair;

import java.util.HashMap;
import java.util.Map;

public class PairGenericTest {
    public static void main(String[] args) {
        //멀티 타입 파라메터
        Pair<String,Integer> pair = new Pair<>("Java",1);

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        // 검색을 빠르게 할 수 있는 자료구조 (HashMap, Hashtable)
        Map<String,Integer> maps = new HashMap<>();

        maps.put("kor",60);
        maps.put("eng",70);
        maps.put("math",90);

        System.out.println(maps.get("kor"));
        System.out.println(maps.get("eng"));
        System.out.println(maps.get("math"));
    }
}
