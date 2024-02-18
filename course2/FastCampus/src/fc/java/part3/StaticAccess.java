package fc.java.part3;

import fc.java.model.MyUtil;

public class StaticAccess {
    public static void main(String[] args) {

        // static 멤버는 클래스를 사용하는 시점에서 자동으로 static-zone에 로딩된다.
        // 따라서 new를 이용해서 객체를 생성할 필요가 없다.

        int a = 10;
        int b = 20;
        // MyUtil
        int sum = MyUtil.hap(a,b); // static 멤버 접근 방법 = 클래스이름.호출메서드
        System.out.println("sum = " + sum);
    }
}
