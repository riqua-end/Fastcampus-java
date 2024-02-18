package fc.java.model;

public class AllStatic {

    private AllStatic(){
        // 인위적으로 생성자를 private으로 할 수 있다.
        // 단 모든 멤버 메서드는 static
    }
    public static int hap(int a, int b){
        int v = a+b;
        return v;
    }

    public static int max(int a, int b){
        return a>b ? a: b;
    }

    public static int min(int a, int b){
        return a<b ? a: b;
    }
}
