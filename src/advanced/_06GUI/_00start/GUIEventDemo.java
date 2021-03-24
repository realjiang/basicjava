package advanced._06GUI._00start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 标题: 事件监听demo
 *
 * @Author: Jiang
 * @Date: 2021/3/23 15:28
 */
public class GUIEventDemo implements ActionListener {
//实现ActionListener接口,表示GUIEventDemo是个ActionListener,事件只会通知实现了ActionListener接口的类
    JFrame frame;
    JButton button;

    public static void main(String[] args) {
        GUIEventDemo demo = new GUIEventDemo();
        demo.go();
    }

    public void go() {
        frame = new JFrame();
        button = new JButton("click me!");
        /**向按钮注册事件*/
        button.addActionListener(this);//this指当前程序
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GUIPaintDemo gp = new GUIPaintDemo();

        frame.getContentPane().add(BorderLayout.SOUTH,button);
        frame.getContentPane().add(BorderLayout.CENTER,gp);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    /**
     * 实现接口的方法,按钮会以ActionEvent对象作为参数来调用此方法
     * @param e ActionEvent对象
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked!");
        frame.repaint();
    }
}
