package objectoriented._02officesystem.info;

/**
 * 标题: 员工
 *
 * @Author: Jiang
 * @Date: 2020/11/28 10:44
 */
public class Staff {
    /**
     * 员工姓名
     */
    private String staffName;
    /**
     * 员工编号
     */
    private String staffNo;
    /**
     * 员工性别
     */
    private String staffSex;
    /**
     * 员工年龄
     */
    private int staffAge;
    /**
     * 员工所在部门信息
     */
    private Department department;
    /**
     * 员工所处职务信息
     */
    private Post post;

    /**
     * 无参构造
     */
    public Staff() {
    }
    /**
     * 初始化除部门外信息的构造方法
     * @param staffName 员工姓名
     * @param staffNo 员工工号
     * @param staffSex 员工性别
     * @param staffAge 员工年龄
     * @param post 员工所处职务
     */
    public Staff(String staffName, String staffNo, String staffSex, int staffAge, Post post) {
        this.setStaffName(staffName);
        this.setStaffNo(staffNo);
        this.setStaffSex(staffSex);
        this.setStaffAge(staffAge);
        this.setPost(post);
    }
    /**
     * 全参构造
     * @param staffName 员工姓名
     * @param staffNo 员工工号
     * @param staffSex 员工性别
     * @param staffAge 员工年龄
     * @param department 员工所在部门
     * @param post 员工所处职务
     */
    public Staff(String staffName, String staffNo, String staffSex, int staffAge, Department department, Post post) {
        this.setStaffName(staffName);
        this.setStaffNo(staffNo);
        this.setStaffSex(staffSex);
        this.setStaffAge(staffAge);
        this.setDepartment(department);
        this.setPost(post);
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    public String getStaffSex() {
        return staffSex;
    }

    /**
     * 设置员工性别,限制"男"和"女",其他设置为"男"
     * @param staffSex
     */
    public void setStaffSex(String staffSex) {
        if (!"男".equals(staffSex) && !"女".equals(staffSex)) {
            this.setStaffSex("男");
        } else {
            this.staffSex = staffSex;
        }
    }

    public int getStaffAge() {
        return staffAge;
    }

    /**
     * 设置员工年龄,限制18~65之间,范围外设置为18
     * @param staffAge
     */
    public void setStaffAge(int staffAge) {
        if (staffAge<18 || staffAge>65) {
            this.staffAge = 18;
        } else {
            this.staffAge = staffAge;
        }
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    /**
     * 展示员工信息
     * @return 员工信息字符串
     */
    public String showInfo() {
        String info = "姓名:"+this.getStaffName()+"\n工号:"+this.getStaffNo()+"\n性别:"
                +this.getStaffSex()+"\n年龄:"+this.getStaffAge() +"\n职务:"
                +this.getDepartment().getDepName()+this.getPost().getPostName()
                +"\n===========================================";
        return info;
    }
}
