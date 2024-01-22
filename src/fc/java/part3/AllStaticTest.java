package fc.java.part3;

import fc.java.model.AllStatic;

public class AllStaticTest {
    public static void main(String[] args) {
//        AllStatic st = new AllStatic();  // 모든 멤버가 static 일 경우 객체 생성을 하지 않는다
//        System.out.println(st.hap(10,20));
//        System.out.println(st.max(10,20));
//        System.out.println(st.min(10,20));

        System.out.println(AllStatic.hap(10,20));
        System.out.println(AllStatic.min(10,20));
        System.out.println(AllStatic.max(10,20));

        // System sys = new System(); // private
        // System.
        // Math math = new Math(); // private
        // Math.

        System.out.println(Math.max(10,20));
    }
}
