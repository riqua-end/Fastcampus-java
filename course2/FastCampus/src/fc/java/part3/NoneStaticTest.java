package fc.java.part3;

public class NoneStaticTest {
    public static void main(String[] args) {
        // None-static 메서드는 어떻게 접근?
        // - 객체를 생성해서 메모리에 로딩 시켜야 한다.
        // FIFO ( First In First Out) 구조
        int a = 10;
        int b = 20;
        NoneStaticTest st = new NoneStaticTest();

        int sum = st.hap(a,b);
        System.out.println("sum = " + sum);
    }
    public int hap(int a ,int b){
        int sum = a+b;
        return sum;
    }
}
