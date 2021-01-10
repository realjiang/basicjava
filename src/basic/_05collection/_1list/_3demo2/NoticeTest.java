package basic._05collection._1list._3demo2;

import java.util.ArrayList;
import java.util.Date;

/**
 * 标题: 测试类
 *
 * @Author: Jiang
 * @Date: 2020/12/23 10:07
 */
public class NoticeTest {
    public static void main(String[] args) {
        //创建公告对象,生成三条公告
        Notice notice1 = new Notice(1, "欢迎来到慕课网!", "管理员", new Date());
        Notice notice2 = new Notice(2, "请同学们按时提交作业!", "老师", new Date());
        Notice notice3 = new Notice(3, "考勤通知!", "老师", new Date());
        //添加公告
        ArrayList noticeList = new ArrayList();
        noticeList.add(notice1);
        noticeList.add(notice2);
        noticeList.add(notice3);
        //显示公告
        System.out.println("公告的内容为:");
        for (int i = 0; i < noticeList.size(); i++) {
            //需要进行强制转换为notice对象,不然返回的是object对象,没有get/set方法
            System.out.println((i+1)+":"+((Notice) (noticeList.get(i))).getTitle());
        }
        System.out.println("*****************************************************************");
        //在第一条公告后面添加一条公告
        Notice notice4 = new Notice(4, "在线编辑器可以使用了!", "管理员", new Date());
        noticeList.add(1,notice4);
        //显示公告
        System.out.println("添加后,公告的内容为:");
        for (int i = 0; i < noticeList.size(); i++) {
            //需要进行强制转换为notice对象,不然返回的是object对象,没有get/set方法
            System.out.println((i+1)+":"+((Notice) (noticeList.get(i))).getTitle());
        }
        System.out.println("*****************************************************************");
        //删除 按时完成作业那条公告
        noticeList.remove(2);//方式一
        //显示公告
        System.out.println("删除后,公告的内容为:");
        for (int i = 0; i < noticeList.size(); i++) {
            //需要进行强制转换为notice对象,不然返回的是object对象,没有get/set方法
            System.out.println((i+1)+":"+((Notice) (noticeList.get(i))).getTitle());
        }
        System.out.println("*****************************************************************");
        //修改 在线编辑器可以使用了 那条公告
        notice4.setTitle("Java在线编辑器可以使用啦!");
        noticeList.set(1,notice4);//修改(索引,元素)
        //显示公告
        System.out.println("修改后,公告的内容为:");
        for (int i = 0; i < noticeList.size(); i++) {
            //需要进行强制转换为notice对象,不然返回的是object对象,没有get/set方法
            System.out.println((i+1)+":"+((Notice) (noticeList.get(i))).getTitle());
        }
    }
}
