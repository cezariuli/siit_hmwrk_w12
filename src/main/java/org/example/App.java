package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Integer noOfAttendees = 500000;
        FestivalGate gate = new FestivalGate();
        FestivalStatisticsThread statsThread = new FestivalStatisticsThread(gate);

        statsThread.start();

        for (int i=0; i<noOfAttendees;i++) {
            TicketType ticketType = TicketTypeRandom.RandomTicket();
            FestivalAttendeeThread festivalAttendee = new FestivalAttendeeThread(ticketType, gate);
            festivalAttendee.start();
        }


        //System.out.println( "Hello World!" );
    }
}
