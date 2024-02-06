package fc.java.course2.part2;

import fc.java.model2.Connection;
import fc.java.model2.OracleDriver;

public class DataBaseConnection {
    public static void main(String[] args) {
        // Oracle DB 접속 (가상)
        Connection conn = new OracleDriver();
        conn.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
    }
}
