package advanced._06GUI._00start;

import javax.swing.*;
import java.awt.*;

/**
 * 标题: 绘图组件
 *
 * @Author: Jiang
 * @Date: 2021/3/23 15:49
 */
public class GUIPaintDemo extends JPanel {
    @Override
    protected void paintComponent(Graphics g) { //不能自己调用,要系统调用
        g.setColor(Color.ORANGE);///设置图形颜色
        g.fillRect(20, 50, 100, 100);//画出图形
    }
}
