package fc.java.part4;

public class EmployeeTest {
    public static void main(String[] args) {
        // 일반 사원 한명의 객체를 생성하고 데이터를 저장 후 출력을 하세요.
        RempVO vo = new RempVO();
        vo.name="홍길동";
        vo.age=50;
        vo.dept="홍보부";
        vo.empDate="2022-10-10";
        vo.phone="010-1234-1234";
        vo.marriage=true;

        System.out.println(vo.toString());
    }
}
