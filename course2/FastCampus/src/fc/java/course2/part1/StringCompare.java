package fc.java.course2.part1;

public class StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String str1 = "Hello";
        String str2 = "World";

        // equals() 메서드는 두 문자열이 같으면 True, 다르면 false를 반환
        if (str1.equals(str2)){
            System.out.println("두 문자열은 같습니다.");
        }
        else {
            System.out.println("두 문자열은 다릅니다.");
        }

        //compareTo()메서드는 문자열을 사전순으로 비교하며, 두 문자열이 같으면 0을 반환하고
        //비교 대상 문자열이 기준 문자열보다 작으면 음수를 크면 양수를 반환
        //아스키코드 값으로 계산
        // 0, 음수, 양수
        String str3 = "apple";
        String str4 = "banana";

        int result = str3.compareTo(str4);
        if (result == 0){
            System.out.println("두 문자열은 같습니다.");
        }
        else if (result < 0){
            System.out.println("str3이 str4보다 앞에 있습니다.");
        }
        else {
            System.out.println("str3이 str4보다 뒤에 있습니다.");
        }
    }
}
