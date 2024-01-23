package fc.java.part4;

// 사원
public class Employee{ // extends Object 최상위 클래스 생략

    // protected 는 같은 패키지 내에서만 접근 가능함
    // '상속 관계에서 하위 클래스가 상위 클래스에 접근을 허용'

    protected String name;
    protected int age;
    protected String phone;
    protected String empDate;
    protected String dept;
    protected boolean marriage;

    public Employee(){
        super(); // 상위 클래스의 생성자를 호출 -> new Object()의 생성자 호출
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
