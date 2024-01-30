package fc.java.poly;

public class Board extends Object{ // toString()
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // 반드시 Object의 toString()을 재정의 (override)

    @Override
    public String toString() {
        super.toString(); // 상위 클래스의 메서드 호출
        return "Board{" +
                "title='" + title + '\'' +
                '}';
    }
}
