package advanced._01jdbc.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSample {
    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/learnJDBC";
            Connection conn = DriverManager.getConnection(url,"jiang","123456");
            System.out.println(conn);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
