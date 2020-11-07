package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class FestivalGate {
    private String festivalName;
    private Integer noOfAttendees = 0;
    private Integer noOfFull = 0;
    private Integer noOfFullVip = 0;
    private Integer noOfOneDay = 0;
    private Integer noOfOneDayVip = 0;
    Queue<TicketType> attendeesQueue = new LinkedList<>();

    public Integer getTotalAttendees() {
        this.noOfAttendees = attendeesQueue.size();
        return this.noOfAttendees;
    }

    public void updateQueue(TicketType ticket) {
        attendeesQueue.add(ticket);
        switch (ticket) {
            case FULL:
                this.noOfFull++;
                break;
            case FULL_VIP:
                this.noOfFullVip++;
                break;
            case ONE_DAY:
                this.noOfOneDay++;
                break;
            case ONE_DAY_VIP:
                this.noOfOneDayVip++;
                break;
            default:
                System.out.println("Incorrect ticket type");
        }
    }


    public Integer getNoOfFull() {
        return noOfFull;
    }

    public Integer getNoOfFullVip() {
        return noOfFullVip;
    }

    public Integer getNoOfOneDay() {
        return noOfOneDay;
    }

    public Integer getNoOfOneDayVip() {
        return noOfOneDayVip;
    }
}
