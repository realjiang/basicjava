package src._07thread._6communication._2weathertest;

/**
 * 天气
 */
public class Weather {
    private int wd;//温度
    private int sd;//湿度
    boolean flag = false;

    public synchronized void read() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("读取天气数据" + toString());
        flag = false;
        notifyAll();
    }

    public synchronized void generate() {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        setWd((int) (Math.random() * 40));
        setSd((int) (Math.random() * 100));
        System.out.println("生成天气数据" + toString());
        flag = true;
        notifyAll();
    }

    @Override
    public String toString() {
        return "[温度:" + wd + ", 湿度:" + sd + "]";
    }

    public int getWd() {
        return wd;
    }
    public void setWd(int wd) {
        this.wd = wd;
    }

    public int getSd() {
        return sd;
    }

    public void setSd(int sd) {
        this.sd = sd;
    }

}
