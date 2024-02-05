package fc.java.course2.part1;

public class WrapperTest {
    public static void main(String[] args) {
        // 정수형 변수에 10을 저장하세요.
        int a = 10; // 기본 자료형
        // 객체 형태로
//        Integer aa = new Integer(10); // 사용자 정의 자료형
        Integer aa = 10; // Auto-boxing , 10 = new Integer(10);
        System.out.println(aa.intValue()); // unboxing (Integer->int)

        Integer bb = 20; // Auto-boxing
        int b = bb; // Auto-unboxing

        float f = 10.5f;
        Float ff = 45.6f; // Auto-boxing
        System.out.println(ff.floatValue());

        Float af = 49.5f;
        System.out.println(af.floatValue());
        float aff = af; // af.floatValue() -> Auto-boxing
        System.out.println(aff);
    }
}
