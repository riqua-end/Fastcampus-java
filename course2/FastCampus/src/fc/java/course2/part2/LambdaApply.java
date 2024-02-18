package fc.java.course2.part2;

import fc.java.model2.StringOperation;

public class LambdaApply {
    public static void main(String[] args) {
//        StringOperation toUpperCase = String::toUpperCase; 메서드 참조형으로도 가능
        // 람다식을 메서드 내에서 사용하거나 메서드의 인자로 전달
        // 람다식으로 모든 문자를 대문자로 변환하는 StringOperation 구현
        StringOperation toUpperCase = s -> s.toUpperCase();
        // 람다식으로 모든 문자를 소문자로 변환하는 StringOperaion 구현
        StringOperation toLowerCase = s -> s.toLowerCase();

        // processString 메서드에 람다 표현식을 인자로 전달하여 결과를 출력
        String input = "Lambda Expressions";
        System.out.println(processString(input, toUpperCase));
        System.out.println(processString(input, toLowerCase));
    }

    // 람다 표현식을 인자로 사용하는 메서드 작성
    public static String processString(String input,StringOperation operation){
        return operation.apply(input);
    }
}
