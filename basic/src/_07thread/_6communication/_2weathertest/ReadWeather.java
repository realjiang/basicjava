package src._07thread._6communication._2weathertest;

import src._07thread._6communication._1queuedemo.Queue;

public class ReadWeather implements Runnable{
    Weather weather;
    ReadWeather(Weather weather){
        this.weather=weather;
    }

    @Override
    public void run() {
        for (int i=0;i<100;i++) {
            weather.read();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
