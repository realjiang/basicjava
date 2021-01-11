package advanced._01jdbc.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 标准JDBC操作五步骤
 */
public class StandardJDBCSample {
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
            ResultSet rs = stmt.executeQuery("select * from employee where dname='研发部'");
            //4. 遍历查询结果
            while (rs.next()) {
                Integer eno = rs.getInt(1); //eno
                String ename = rs.getString("ename");
                Float salary = rs.getFloat("salary");
                String dname = rs.getString("dname");
                System.out.println(dname + "-" + eno + "-" + ename + "-" + salary);
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
