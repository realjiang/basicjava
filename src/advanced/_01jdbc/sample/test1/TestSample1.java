package advanced._01jdbc.sample.test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 例题1 Statement
 */
public class TestSample1 {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            //1. 加载并注册JDBC驱动
//            Class.forName("com.mysql.cj.jdbc.Driver");//mysql
            Class.forName("org.mariadb.jdbc.Driver");//mariadb，这句不写也行
            //2. 创建数据库连接
            /*conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/imooc?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai",
                    "root", "root"
            );*/ //mysql8
            conn = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/learnJDBC",
                    "jiang", "123456"
            );
            //3. 创建Statement对象
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from goods where prize < 3500");
            //4. 遍历查询结果
            while (rs.next()) {
                Integer id = rs.getInt(1); //eno
                String name = rs.getString("name");
                Float prize = rs.getFloat("prize");
                String desp = rs.getString("desp");
                System.out.println(id + " " + name + " " + prize + " " + desp);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (conn != null && conn.isClosed() == false) {
                    //5. 关闭连接,释放资源
                    conn.close();
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
