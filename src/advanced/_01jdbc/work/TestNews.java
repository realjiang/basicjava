package advanced._01jdbc.work;

import advanced._01jdbc.sample.DbUtilsSample;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

/**
 * 测试类
 */
public class TestNews {
    public static void main(String[] args) {
        //菜单
        System.out.println("欢迎来到新闻管理系统");
        System.out.println("=======================");
        System.out.println("   1 添加新闻");
        System.out.println("   2 查看新闻");
        System.out.println("   3 编辑新闻");
        System.out.println("   4 删除新闻");
        System.out.println("   5 退出系统");
        System.out.println("请输入1-5之间的数字进行操作");
        Scanner in = new Scanner(System.in);
        Integer cmd = in.nextInt();
        switch (cmd){
            case 1:
                System.out.println("添加新闻");
                insert();//添加
                search();
                break;
            case 2:
                System.out.println("新闻列表如下");
                search();//查看
                break;
            case 3:
                search();
                System.out.println("请输入要修改的新闻id");
                edit();//编辑
                break;
            case 4:
                search();
                System.out.println("请输入要删除的新闻id");
                del();//删除
                break;
            case 5://退出系统
                break;
            default:
                System.out.println("输入错误，请重新输入1-5之间的数字");
                break;
        }
    }

    /**
     * 添加新闻
     */
    public static void insert() {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入新闻标题：");
        String title = in.next();
        System.out.println("请输入新闻内容：");
        String content = in.next();
        System.out.println("请输入新闻日期：");
        String strdate = in.next();
        java.util.Date udate = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            udate = sdf.parse(strdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //2.java.util.Date转为java.sql.Date
        long time = udate.getTime();//获取自1970年到现在的毫秒数
        java.sql.Date sdate = new java.sql.Date(time);
        Properties properties = new Properties();
        String propertyFile = TestNews.class.getResource("/druid-config.properties").getPath();
        Connection conn = null;
        try {
            propertyFile = new URLDecoder().decode(propertyFile, "UTF-8");
            properties.load(new FileInputStream(propertyFile));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            conn = dataSource.getConnection();//写入操作时，需要获取数据库连接
            conn.setAutoCommit(false);
            String sql = "insert into news(title,content,create_time) values(?,?,?)";
            QueryRunner qr = new QueryRunner();//写入时不用传入dataSource
            qr.update(conn,sql,new Object[]{title,content,sdate});//数据库连接，sql，参数
            conn.commit();
            System.out.println("添加成功");
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

    /**
     * 查询所有新闻
     */
    public static void search() {
        Properties properties = new Properties();
        String propertyFile = DbUtilsSample.class.getResource("/druid-config.properties").getPath();
        try {
            propertyFile = new URLDecoder().decode(propertyFile, "UTF-8");
            properties.load(new FileInputStream(propertyFile));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            //利用Apache DbUtils大幅简化了数据的提取过程
            QueryRunner qr = new QueryRunner(dataSource);//传入dataSource，QueryRunner就知道向哪个数据库进行读取和写入了
            List<News> list =  qr.query("select * from news",//sql
                    new BeanListHandler<>(News.class));
            for (News news : list) {
                System.out.println(news);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据id查新闻
     * @param id 新闻id
     */
    public static int searchById(Integer id) {
        Properties properties = new Properties();
        String propertyFile = DbUtilsSample.class.getResource("/druid-config.properties").getPath();
        try {
            propertyFile = new URLDecoder().decode(propertyFile, "UTF-8");
            properties.load(new FileInputStream(propertyFile));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            //利用Apache DbUtils大幅简化了数据的提取过程
            QueryRunner qr = new QueryRunner(dataSource);//传入dataSource，QueryRunner就知道向哪个数据库进行读取和写入了
            List<News> list =  qr.query("select * from news where id = ?",//sql
                    new BeanListHandler<>(News.class),new Object[]{id});
            if (!list.isEmpty()) {
                System.out.println(list.get(0));
            } else {
                System.out.println("没找到id"+id+"对应的新闻信息");
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }

    /**
     * 编辑新闻
     */
    public static void edit() {
        Scanner in = new Scanner(System.in);
        Integer id = in.nextInt();
        int flag = searchById(id);
        if (flag == 0) {
            return;
        }
        System.out.println("请输入要修改的新闻标题：");
        String title = in.next();
        System.out.println("请输入要修改的新闻内容：");
        String content = in.next();
        Properties properties = new Properties();
        String propertyFile = DbUtilsSample.class.getResource("/druid-config.properties").getPath();
        Connection conn = null;
        try {
            propertyFile = new URLDecoder().decode(propertyFile, "UTF-8");
            properties.load(new FileInputStream(propertyFile));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            conn = dataSource.getConnection();//写入操作时，需要获取数据库连接
            conn.setAutoCommit(false);
            String sql = "update news set title=?,content=? where id=?"; //更新新闻
            QueryRunner qr = new QueryRunner();//写入时不用传入dataSource
            qr.update(conn,sql,new Object[]{title,content,id});//数据库连接，sql，参数
            conn.commit();
            System.out.println("修改成功");
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
    public static void del() {
        Scanner in = new Scanner(System.in);
        Integer id = in.nextInt();
        Properties properties = new Properties();
        String propertyFile = DbUtilsSample.class.getResource("/druid-config.properties").getPath();
        Connection conn = null;
        try {
            propertyFile = new URLDecoder().decode(propertyFile, "UTF-8");
            properties.load(new FileInputStream(propertyFile));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            conn = dataSource.getConnection();//写入操作时，需要获取数据库连接
            conn.setAutoCommit(false);
            String sql = "delete from news where id=?";
            QueryRunner qr = new QueryRunner();//写入时不用传入dataSource
            qr.update(conn,sql,new Object[]{id});//数据库连接，sql，参数
            conn.commit();
            System.out.println("删除成功");
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
}
