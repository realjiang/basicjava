package objectoriented._02officesystem.info;

/**
 * 标题: 职务
 *
 * @Author: Jiang
 * @Date: 2020/11/28 10:53
 */
public class Post {
    /**
     * 职务编号
     */
    private String postNo;
    /**
     * 职务名称
     */
    private String postName;

    /**
     * 无参构造
     */
    public Post() {
    }

    /**
     * 全参构造
     * @param postNo 职务编号
     * @param postName 职务名称
     */
    public Post(String postNo, String postName) {
        this.setPostNo(postNo);
        this.setPostName(postName);
    }

    public String getPostNo() {
        return postNo;
    }

    public void setPostNo(String postNo) {
        this.postNo = postNo;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }
}
