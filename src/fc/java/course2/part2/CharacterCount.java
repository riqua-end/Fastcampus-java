package fc.java.course2.part2;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        //주어진 문자열에서 문자 하나씩 몇 번 나오는지 출력
        String str = "Hello, World";
        //Map 객체 생성
        Map<Character,Integer> charCountMap = new HashMap<>();
        //char[]에 str의 문자열을 하나씩 쪼개서 저장
        char[] strArray = str.toCharArray(); // {'H','e','l','l','o',.......}


        for (char c : strArray){
            if (charCountMap.containsKey(c)){ //Map에 문자가 포함되어있는지 확인
                charCountMap.put(c,charCountMap.get(c)+1); //map에 문자를 저장하고 같은 문자가 있으면 그 해당 문자를 불러와서 value값에 +1을 더함
            }
            else {
                charCountMap.put(c,1); // Map에 문자를 저장하고 같은 문자가 없으면 value를 1로 저장
            }
        }
        System.out.println("Character Counts ...");

        // c에 key의 값을 빼내고 그에 해당하는 value값을 불러옴
        for (char c : charCountMap.keySet()){
            System.out.println(c + " : " + charCountMap.get(c));
        }
    }
}
