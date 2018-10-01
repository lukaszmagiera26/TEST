import java.math.BigDecimal;

public class TicketChecker {

TicketsList ticketsList = new TicketsList();
TicketsConstructor ticketsConstructor;


public boolean checker(BigDecimal tickedChoosed){
    boolean result = false;
    for (TicketsConstructor ticketsConstructor : ticketsList.getTicketslist() ) {
        if (ticketsConstructor.getTicket().equals(tickedChoosed)){
            result = true;
        }
    }
    return result;
}

public BigDecimal checkerOneTicketfromList(BigDecimal ticketChoosed){
    for (TicketsConstructor ticketsConstructor : ticketsList.getTicketslist() ) {
        if (ticketsConstructor.getTicket().equals(ticketChoosed)){
            return ticketsConstructor.getTicket();
        }
    }
    return null;
}



}
