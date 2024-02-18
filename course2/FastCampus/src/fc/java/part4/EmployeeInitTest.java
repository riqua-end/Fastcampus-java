package fc.java.part4;

public class EmployeeInitTest {
    public static void main(String[] args) {
        // * 초기화는 해당하는 객체 자신이 하는것이 바람직하다.
        // 부모의 생성자에서 초기화 하는 것이 바람직하다
        RempVO vo = new RempVO("홍길동",33,"010-1111-1111","2024-10-10","홍보부",false);
        System.out.println("vo.toString() = " + vo.toString());
    }
}
