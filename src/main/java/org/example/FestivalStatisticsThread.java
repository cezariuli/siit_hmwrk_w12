package org.example;

public class FestivalStatisticsThread extends Thread {
    @Override
    public void run() {

        while(true) {

            try {
                Thread.sleep(5*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
