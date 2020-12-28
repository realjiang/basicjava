package src._09comprehensivecase._1player;

import java.io.Serializable;
import java.util.Objects;

/**
 * 标题:歌曲类
 *
 * @Author: Jiang
 * @Date: 2020/12/28 15:35
 */
public class Song implements Serializable {
    private String id;//歌曲id
    private String name;//歌曲名
    private String singer;//演唱者
    //重写toString方法
    @Override
    public String toString() {
        return "歌曲信息:" +
                "id为:" + id +
                ", 歌曲名称为:" + name +
                ", 演唱者为:" + singer;
    }
    //重写hashCode和equals方法
    @Override
    public boolean equals(Object o) {
        //判断对象是否相等,相等则直接返回true
        if (this == o) return true;
        //如果同是Song类型,才能强制转换
        if (o.getClass() == Song.class) {
            Song song = (Song) o;
            return (song.getId().equals(id) && song.getName().equals(name) && song.getSinger().equals(singer));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSinger());
    }

    //无参构造
    public Song() {
    }
    //全参构造
    public Song(String id, String name, String singer) {
        this.id = id;
        this.name = name;
        this.singer = singer;
    }
    //get和set方法
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
