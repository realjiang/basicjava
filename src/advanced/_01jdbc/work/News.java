package advanced._01jdbc.work;

import java.util.Date;

/**
 * News实体类
 */
public class News {
    private int id;//新闻id
    private String title;//新闻标题
    private String content;//新闻内容
    private Date create_time;//创建时间

    /**
     * 无参构造
     */
    public News() {
    }

    /**
     * 带参构造
     * @param id id
     * @param title 标题
     * @param content 内容
     * @param create_time 创建时间
     */
    public News(int id, String title, String content, Date create_time) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.create_time = create_time;
    }

    /**
     * 以下是get/set方法
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * toString方法
     * @return string
     */
    @Override
    public String toString() {
        return "News[" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", create_time=" + create_time +
                ']';
    }
}
