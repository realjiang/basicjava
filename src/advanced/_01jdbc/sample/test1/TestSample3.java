package advanced._01jdbc.sample.test1;

import advanced._01jdbc.common.DbUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * 例题3 preparedStatement实现增删改
 */
public class TestSample3 {
    public static void main(String[] args) {

        try {
            System.out.println("1-新增商品信息");
            System.out.println("2-修改商品价格");
            System.out.println("3-删除商品");
            System.out.println("请选择功能:");
            Scanner in = new Scanner(System.in);
            Integer cmd = in.nextInt();
            Connection conn = DbUtils.getConnection();
            Connection conn2 = DbUtils.getConnection();
            switch (cmd){
                case 1:
                    execute1(conn,conn2);
                    break;
                case 2:
                    execute2(conn);
                    break;
                case 3:
                    execute3(conn);
                    break;
            }
            //加载并注册JDBC驱动


        }catch(Exception e){
            e.printStackTrace();
        }
    }



    /**
     * 新增，如果新增成功显示所有数据，否则显示添加失败
     */
    private static void execute1(Connection conn1,Connection conn2){
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        ResultSet rs = null;
        try {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入商品名称:");
        String gname = in.next();
        System.out.print("请输商品价格:");
        float prize = in.nextFloat();
        System.out.print("请输入商品描述:");
        String desp = in.next();
        //创建preparedStatement对象
        String sql1 = "insert into goods(gname,prize,desp) values (?,?,?)";
        pstmt1 = conn1.prepareStatement(sql1);
        pstmt1.setString(1, gname);
        pstmt1.setFloat(2, prize);
        pstmt1.setString(3, desp);
        int cnt = pstmt1.executeUpdate(); // 注意这里不要写sql参数，否则会报错
        if (cnt == 1) {
            String sql2 = "select * from goods";
            pstmt2 = conn2.prepareStatement(sql2);
            rs = pstmt2.executeQuery();
            while (rs.next()) {
                 Integer id1 = rs.getInt(1);
                 String gname1 = rs.getString(2);
                 Float prize1 = rs.getFloat(3);
                 String desp1 = rs.getString(4);
                System.out.println(id1 + "-" + gname1 + "-" + prize1 + "-" + desp1);
            }

        } else {
            System.out.println("添加失败！");
        }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DbUtils.closeConnection(null,pstmt1,conn1);
            DbUtils.closeConnection(rs,pstmt2,conn2);
        }
    }

    /**
     * 更新商品价格
     * @param conn
     */
    private static void execute2(Connection conn){
        PreparedStatement pstmt = null;
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("请输入商品名称:");
            String gname = in.next();
            System.out.print("请输入商品新的价格:");
            float prize = in.nextFloat();
            String sql = "update goods set prize = ? where gname = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setFloat(1,prize);
            pstmt.setString(2,gname);
            int cnt = pstmt.executeUpdate();
            if (cnt > 0) {
                System.out.println("更新成功");
            } else {
                System.out.println("没有"+gname+"的商品信息");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DbUtils.closeConnection(null,pstmt,conn);
        }
    }

    /**
     * 删除商品信息
     * @param conn
     */
    private static void execute3(Connection conn){
        PreparedStatement psmt = null;
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("请输入商品名称:");
            String gname = in.next();
            String sql = "delete from goods where gname = ?";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1,gname);
            int cnt = psmt.executeUpdate();
            if (cnt > 0) {
                System.out.println("删除成功");
            } else {
                System.out.println("没有"+gname+"的商品信息");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DbUtils.closeConnection(null,psmt,conn);
        }
    }
}
