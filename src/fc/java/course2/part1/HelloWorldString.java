package fc.java.course2.part1;

public class HelloWorldString {
    public static void main(String[] args) {

        String str = new String("HelloWorld"); // Heap
        System.out.println("str.toString() = " + str.toString());


        String str1 = "HelloWorld"; // Literal Pool // 동일한 문자열일 경우 이미 만들어진 메모리를 재활용한다
        System.out.println(str1.toString());
    }
}
