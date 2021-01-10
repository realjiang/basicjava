package basic._09comprehensivecase._1player;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 标题: 播放列表类
 *
 * @Author: Jiang
 * @Date: 2020/12/28 15:38
 */
public class PlayList {
    private String playListName;//播放列表名称
    private List<Song> musicList;//播放列表中的歌曲集合

    //将歌曲添加到播放列表
    public void addToPlayList(Song song) {
        //要排除重复添加的情况
        boolean songExist = false;//判断歌曲是否已存在于播放列表
        for (Song item : musicList) {
            if (item.equals(song)) {
                songExist = true;break;
            }
        }
        if (songExist) {
            System.out.println("该歌曲已存在与播放列表中,添加失败!");
        } else {
            musicList.add(song); //原来把这句写到for循环里,报错了,不能一边遍历集合一边操作集合
        }
    }

    //显示播放列表中所有歌曲
    public void disPlayAllSong() {
        System.out.println("播放列表中的所有歌曲为:");
        if (musicList.isEmpty()) {
            System.out.println("暂无歌曲");
        }else {
            for (Song item : musicList) {
                System.out.println(item);
            }
        }
    }

    //通过id查询歌曲
    public Song searchSongById(String id) {
        Song song = null;
        //Id是唯一的
        for (Song item : musicList) {
            if (item.getId().equals(id)) {
                //如果相等就找到了
                song = item;
                break;
            }
        }
        return song;
    }

    //通过名称查询歌曲
    public Song searchSongByName(String name) {
        Song song = null;
        //Id是唯一的
        for (Song item : musicList) {
            if (item.getName().equals(name)) {
                //如果相等就找到了
                song = item;
                break;
            }
        }
        return song;
    }

    /**
     * 修改播放列表中歌曲信息
     * @param id 歌曲id
     * @param song 新的歌曲信息
     */
    public void updateSong(String id, Song song) {
        Song song1 = searchSongById(id);
        if (song1 != null) {
            //获得原来的歌曲id
            String oldId = song1.getId();
            //将id还原
            song.setId(oldId);
            //先移除原来的信息,再添加新的信息
            musicList.remove(song1);
            musicList.add(song);
            System.out.println("修改成功!");
        } else {
            System.out.println("没有找到id为"+id+"对应的歌曲信息!");
        }
    }

    //从播放列表删除歌曲
    public void deleteSong(String id) {
        Song song1 = searchSongById(id);
        if (song1 != null) {
            musicList.remove(song1);
            System.out.println("删除成功!");
        } else {
            System.out.println("没有找到id为"+id+"对应的歌曲信息!");
        }
    }

    //按歌曲名升序进行排序
    public void sortBySongName() {
        Collections.sort(musicList,new NameComparator());
    }

    //导出歌单到txt功能(按歌曲名称升序排序)
    public void downloadPlayList() {
        try {

                FileOutputStream fos = new FileOutputStream("basic//src//_08io//_3bytestream//file//"+playListName+".txt",true);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                sortBySongName();
                for (Song song : musicList) {
                    oos.writeObject(song);
                }
                oos.close();
                fos.close();
                System.out.println("导出成功！");
            } catch (FileNotFoundException e) {
                System.out.println("导出失败:"+e);
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("导出失败:"+e);
                e.printStackTrace();
            }
    }

    //构造方法
    public PlayList() {
    }
    public PlayList(String playListName) {
        this.playListName = playListName;
        musicList = new ArrayList<Song>();
    }
    //get和set方法
    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public List<Song> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Song> musicList) {
        this.musicList = musicList;
    }
}
