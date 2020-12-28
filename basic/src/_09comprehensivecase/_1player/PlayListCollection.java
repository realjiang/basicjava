package _09comprehensivecase._1player;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 标题: 播放器类
 *
 * @Author: Jiang
 * @Date: 2020/12/28 15:44
 */
public class PlayListCollection {
    private Map<String,PlayList> playListMap;//存放播放列表的集合

    //向播放器添加播放列表
    public void addPlayList(PlayList playList) {
        //播放列表名称作为key,map自带不可重复功能
        playListMap.put(playList.getPlayListName(), playList);
        System.out.println("添加成功!");
    }

    //删除播放列表
    public void deletePlayList(PlayList playList) {
        //在业务代码中判断是否为空
        playListMap.remove(playList.getPlayListName());
        System.out.println("删除成功!");
    }

    /**
     * 通过播放列表名称查询播放列表
     * @param playListName 播放列表名称
     * @return 播放列表
     */
    public PlayList searchPlayListByName(String playListName) {
        PlayList playList = null;
        Set<String> playListNames = playListMap.keySet();
        for (String name : playListNames) {
            if (name.equals(playListName)) {
                playList = playListMap.get(name);
                break;
            }
        }
        return playList;
    }

    //显示所有播放列表名称
    public void displayPlayListName() {
        Set<String> playListNames = playListMap.keySet();
        System.out.println("所有播放列表名称:");
        for (String name : playListNames) {
            System.out.println(name);
        }
    }

    //构造方法
    public PlayListCollection() {
        this.playListMap = new HashMap<>();
    }
    //get和set方法
    public Map<String, PlayList> getPlayListMap() {
        return playListMap;
    }
    public void setPlayListMap(Map<String, PlayList> playListMap) {
        this.playListMap = playListMap;
    }
}
