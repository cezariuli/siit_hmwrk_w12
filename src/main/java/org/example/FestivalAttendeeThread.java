package org.example;

public class FestivalAttendeeThread extends Thread {

    TicketType ticketType;
    private Integer attendeeID =0;
    FestivalGate gate = new FestivalGate();

    public FestivalAttendeeThread(TicketType ticket, FestivalGate gate) {
        this.ticketType = ticket;
        this.gate = gate;
    }
    public void run() {
        gate.updateQueue(this.ticketType);
        this.attendeeID = gate.getTotalAttendees() + 1;
    }
}
