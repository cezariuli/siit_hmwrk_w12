package org.example;

import java.sql.SQLOutput;

public class FestivalStatisticsThread extends Thread {

    FestivalGate gate = new FestivalGate();

    public FestivalStatisticsThread(FestivalGate g) {
        this.gate = g;
    }
    @Override
    public void run() {

        while(true) {

            
            System.out.println("-----------------------------------------");
            System.out.println("Total attendees:\t " + gate.getTotalAttendees());
            System.out.println(gate.getNoOfFull() + " people have Full passes.");
            System.out.println(gate.getNoOfFullVip() + " people have Full VIP passes");
            System.out.println(gate.getNoOfOneDay() + " people have One-Dau passes");
            System.out.println(gate.getNoOfOneDayVip() + " people have One-Day VIP passes");

            try {
                Thread.sleep(5*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
