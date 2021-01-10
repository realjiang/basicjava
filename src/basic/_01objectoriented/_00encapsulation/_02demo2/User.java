package basic._01objectoriented._00encapsulation._02demo2;

/**
 * 标题: 用户
 *
 * @Author: Jiang
 * @Date: 2020/11/26 16:16
 */
public class User {

    private String username;
    private String password;

    public User() {
    }
    public User(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
