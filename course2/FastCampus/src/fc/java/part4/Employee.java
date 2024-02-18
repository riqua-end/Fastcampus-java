package fc.java.part4;

// 사원
public class Employee{ // extends Object 최상위 클래스 생략

    // protected 는 같은 패키지 내에서만 접근 가능함
    // '상속 관계에서 하위 클래스가 상위 클래스에 접근을 허용'

    //
    // '상속 관계에서 객체 초기화' = private 적용
    private String name;
    private int age;
    private String phone;
    private String empDate;
    private String dept;
    private boolean marriage;

    public Employee(){
        super(); // 상위 클래스의 생성자를 호출 -> new Object()의 생성자 호출
    }

    public Employee(String name, int age, String phone, String empDate, String dept, boolean marriage) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.empDate = empDate;
        this.dept = dept;
        this.marriage = marriage;
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
