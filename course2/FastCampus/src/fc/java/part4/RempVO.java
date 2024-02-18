package fc.java.part4;

// 일반 사원 (VO)
public class RempVO extends Employee {

    // 클래스를 계층화 하는 것을 '상속' 이라고 한다.

    //      <수직적 구조 설계의 장점>
    // 1.코드의 중복을 최소화
    // 2.새로운 요구사항 발생시 반영이 쉽다.(유지보수가 쉽다)
    // 3.확장성이 좋아진다.

    // 상속을 사용하면 하위 클래스가 상위 클래스를 재활용 가능하다.
    // 하위 클래스가 상위 클래스를 접근하여 사용 가능
    public RempVO(){ // 자식이 부모의 상태 정보를 마음대로 접근 하므로 정보 은닉에 위배됨.
        super();
    }

    public RempVO(String name,int age, String phone, String empDate, String dept, boolean marriage){
        // 초기화 ( 자식이 부모의 기억 공간에 초기화를 하는 경우 )

//        this.name=name;
//        this.age=age;
//        this.dept=dept;
//        this.empDate=empDate;
//        this.phone=phone;
//        this.marriage=marriage;

        // 부모의 생성자 호출 , 부모의 생성자에서 초기화 하는 것이 바람직 하다.
        super(name,age,phone,empDate,dept,marriage);
    }
}
