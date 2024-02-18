package fc.java.model2;

// 인터페이스는 자바에서 제공을 한다.
public interface Connection {
    // 데이터베이스 연결 동작
    public void getConnection(String url,String username,String password);
}
