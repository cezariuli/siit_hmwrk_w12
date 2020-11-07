package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Integer noOfAttendees = 100000;
        FestivalGate gate = new FestivalGate();
        FestivalStatisticsThread statsThread = new FestivalStatisticsThread(gate);

       for (int i=0; i<noOfAttendees;i++) {
           TicketType ticketType = TicketTypeRandom.RandomTicket();
           FestivalAttendeeThread festivalAttendee = new FestivalAttendeeThread(ticketType, gate);
           festivalAttendee.start();
       }

       statsThread.start();

        assertTrue( true );
    }
}
