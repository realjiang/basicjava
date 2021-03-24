package advanced._06GUI._00start;

import javax.swing.*;

/**
 * 标题: GUI入门
 *
 * @Author: Jiang
 * @Date: 2021/3/23 14:58
 */
public class GUIDemo {
    public static void main(String[] args) {
        //创建frame
        JFrame frame = new JFrame();
        //创建widget(可以理解成组件)
        JButton button = new JButton("click me!");
        //这一行程序会在windows关闭时把程序结束掉
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //把widget放到frame的pane上
        //(Pane是一个功能完整独立的子窗格,Panel是面板，只是一个很少直接使用的基本组件，或者继承重写，或者用来组织其他组件。)
        frame.getContentPane().add(button);
        //显示出来
        frame.setSize(300, 300);//设定frame的大小
        frame.setVisible(true);//显示frame

    }
}
