package objectoriented._03extends._06test3.info;

public class Taxi extends Car {
    private String company;

    /**
     * 不允许重写的ride方法
     */
    public final void ride() {
        String str = this.getUserName() + "的出租车是所属于" + this.getCompany() + "公司的";
        System.out.println(str);
    }

    /**
     * 重写父类use方法
     */
    @Override
    public void use() {
        System.out.println("出租车是提高市民生活质量的重要条件之一");
    }

    /**
     * 重写Object类的toString方法
     * @return str
     */
    @Override
    public String toString() {
        String str = "taxi的信息是："+this.getUserName() + "拥有一辆" + this.getColor() + "颜色的出租车";
        return str;
    }

    /**
     * 无参构造
     */
    public Taxi() {
    }

    /**
     * 全参构造
     * @param color 车的颜色
     * @param userName 车主姓名
     * @param company 车所属公司
     */
    public Taxi(String color, String userName, String company) {
        super(color, userName);
        this.setCompany(company);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
