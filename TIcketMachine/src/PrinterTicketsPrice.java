public class PrinterTicketsPrice {
    TicketsList ticketsList = new TicketsList();
 TicketsConstructor ticketsConstructor;

    public void printer(){

        for (TicketsConstructor ticketsConstructor : ticketsList.getTicketslist()) {


           System.out.println(ticketsConstructor);

        }



    }
}
