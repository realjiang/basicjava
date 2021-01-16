package advanced._01jdbc.sample;

import advanced._01jdbc.hrapp.entity.Employee;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

/**
 * Apache DBUtils + Druid联合使用演示
 */
public class DbUtilsSample {
    private static void query(){
        Properties properties = new Properties();
        String propertyFile = DbUtilsSample.class.getResource("/druid-config.properties").getPath();
        try {
            propertyFile = new URLDecoder().decode(propertyFile, "UTF-8");
            properties.load(new FileInputStream(propertyFile));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            //利用Apache DbUtils大幅简化了数据的提取过程
            QueryRunner qr = new QueryRunner(dataSource);//传入dataSource，QueryRunner就知道向哪个数据库进行读取和写入了
            List<Employee> list =  qr.query("select * from employee limit ?,10",//sql
                    new BeanListHandler<>(Employee.class),//每一个对象对应的实体类
                    new Object[]{10});//参数，要与？一一对应，10代表第一个参数的值为10
            for (Employee emp : list) {
                System.out.println(emp.getEname());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void update(){
        Properties properties = new Properties();
        String propertyFile = DbUtilsSample.class.getResource("/druid-config.properties").getPath();
        Connection conn = null;
        try {
            propertyFile = new URLDecoder().decode(propertyFile, "UTF-8");
            properties.load(new FileInputStream(propertyFile));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            conn = dataSource.getConnection();//写入操作时，需要获取数据库连接
            conn.setAutoCommit(false);
            String sql1 = "update employee set salary=salary+1000 where eno=?";
            String sql2 = "update employee set salary=salary-500 where eno=?";
            QueryRunner qr = new QueryRunner();//写入时不用传入dataSource
            qr.update(conn,sql1,new Object[]{1000});//数据库连接，sql，参数
            qr.update(conn,sql2,new Object[]{1001});
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                if(conn != null && !conn.isClosed()) {
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            try {
                if(conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        query();
//        update();
    }
}
