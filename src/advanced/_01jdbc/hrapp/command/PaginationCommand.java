package advanced._01jdbc.hrapp.command;


import advanced._01jdbc.common.DbUtils;
import advanced._01jdbc.hrapp.entity.Employee;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 分页查询员工数据
 */
public class PaginationCommand implements Command{
    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入页号:");
        int page = in.nextInt();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Employee> list = new ArrayList();
        try {
            conn = DbUtils.getConnection();
            String sql = "select * from employee limit ?,10"; // limit是mysql特有的
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,(page-1)*10);
            rs = pstmt.executeQuery();
            while(rs.next()){
                Integer eno = rs.getInt("eno");
                String ename = rs.getString("ename");
                Float salary = rs.getFloat("salary");
                String dname = rs.getString("dname");
                //JDBC获取日期使用java.sql.Date,其继承自java.util.Date
                //所以两者互相兼容
                Date hiredate = rs.getDate("hiredate");
                Employee emp = new Employee();
                emp.setEno(eno);
                emp.setEname(ename);
                emp.setSalary(salary);
                emp.setDname(dname);
                emp.setHiredate(hiredate);
                list.add(emp);
            }
            System.out.println(list.size());
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            DbUtils.closeConnection(rs,pstmt,conn);
        }
    }
}
