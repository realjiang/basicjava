package objectoriented.encapsulation.demo2;

/**
 * 标题: 测试类
 *
 * @Author: Jiang yuting
 * @Date: 2020/11/26 16:21
 */
public class UserTest {
    public static void main(String[] args) {
        User one = new User("Lucy", "123456");
        User two = new User("Mike", "123456");
        System.out.println("用户名:" + one.getUsername());
        System.out.println("密码:" + one.getPassword());
        System.out.println("用户名:" + two.getUsername());
        System.out.println("密码:" + two.getPassword());
        System.out.println("==============================================");
        UserManager um = new UserManager();
        System.out.println(um.checkUser(one, two));
    }
}
