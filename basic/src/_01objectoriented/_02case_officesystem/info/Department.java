package _01objectoriented._02case_officesystem.info;

/**
 * 标题: 部门
 *
 * @Author: Jiang
 * @Date: 2020/11/28 10:49
 */
public class Department {
    /**
     * 部门编号
     */
    private String depNo;
    /**
     * 部门名称
     */
    private String depName;
    /**
     * 员工数组
     */
    private Staff[] staffs;
    /**
     * 员工人数
     */
    private int staffNum;

    /**
     * 无参构造
     */
    public Department() {
    }

    /**
     * 仅初始化部门编号和部门名称的构造方法
     * @param depNo 部门编号
     * @param depName 部门名称
     */
    public Department(String depNo, String depName) {
        this.setDepNo(depNo);
        this.setDepName(depName);
    }

    /**
     * 全参构造
     * @param depNo 部门编号
     * @param depName 部门名称
     * @param staffs 员工数组
     * @param staffNum 员工数量
     */
    public Department(String depNo, String depName, Staff[] staffs, int staffNum) {
        this.setDepNo(depNo);
        this.setDepName(depName);
        this.setStaffs(staffs);
        this.setStaffNum(staffNum);
    }

    public String getDepNo() {
        return depNo;
    }

    public void setDepNo(String depNo) {
        this.depNo = depNo;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    /**
     * 获取该部门员工数组,如果员工数组未被初始化,则先初始化该数组,长度为200,避免空指针异常
     * @return
     */
    public Staff[] getStaffs() {
        if (this.staffs == null) {
            this.staffs = new Staff[200];
        }
        return staffs;
    }

    public void setStaffs(Staff[] staffs) {
        this.staffs = staffs;
    }

    public int getStaffNum() {
        return staffNum;
    }

    public void setStaffNum(int staffNum) {
        this.staffNum = staffNum;
    }

    /**
     * 添加该部门员工
     * @param staff 员工对象
     */
    public void addStaff(Staff staff) {
        //1.将员工保存到员工数组中
        for (int i=this.getStaffNum(); i < this.getStaffs().length; i++) {
            if (this.getStaffs()[i] == null) {
                this.getStaffs()[i] = staff;
                this.getStaffs()[i].setDepartment(this);
                //2.保存员工数量
                this.setStaffNum(i+1);
                return;
            }
        }
    }

    /**
     * 统计该部门员工数量
     * @return 该部门员工数量信息字符串
     */
    public String getNumOfStaff() {
        return this.getDepName() + "总共有" + this.getStaffNum() + "名员工";
    }
}
