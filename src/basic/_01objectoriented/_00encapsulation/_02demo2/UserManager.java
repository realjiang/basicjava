package basic._01objectoriented._00encapsulation._02demo2;

/**
 * 标题: 用户管理
 *
 * @Author: Jiang
 * @Date: 2020/11/26 16:19
 */
public class UserManager {
    public String checkUser(User one, User two) {
        // 判断用户名和密码是否为空，是否一致
        if (one.getPassword().equals(two.getPassword())
                && one.getUsername().equals(two.getUsername())) {
            return "用户名和密码一致";
        }
        return "用户名或密码不一致";
    }
}
