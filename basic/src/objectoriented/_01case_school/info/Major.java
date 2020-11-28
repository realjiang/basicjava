package objectoriented._01case_school.info;

/**
 * 标题: 专业
 *
 * @Author: Jiang
 * @Date: 2020/11/27 15:45
 */
public class Major {
    private String mname;
    private String majorId;
    private int majorlife;
    //无参构造
    public Major() {
    }
    //全参构造
    public Major(String mname, String majorId, int majorlife) {
        this.setMname(mname);
        this.setMajorId(majorId);
        this.setMajorlife(majorlife);
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    public int getMajorlife() {
        return majorlife;
    }
    //设置学制年限,限制必须>0
    public void setMajorlife(int majorlife) {
        if (majorlife <= 0) {
            return; //结果为默认值0
        }
        this.majorlife = majorlife;
    }

    //描述信息方法
    public String showMajorInfo() {
        String info = "专业信息如下:\n专业名称:" + mname + "\n专业编号:" + majorId +"\n学制年限:" + majorlife + "年";
        return info;
    }
}
