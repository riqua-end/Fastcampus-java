package fc.java.model;

public class MemberDTO {
    public String name;
    private int age; // 정보 은닉
    public String phone;

    public void play(){ // 메서드는 클래스끼리의 상호작용을 위해서 public
        System.out.println("운동을 한다.");
    }
}
