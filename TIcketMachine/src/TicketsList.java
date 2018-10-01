import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TicketsList {

    private BigDecimal ticket2_80 = new BigDecimal("2.80");
    private BigDecimal count = new BigDecimal("100");


    private List<TicketsConstructor> ticketslist = new ArrayList<>();

    {
        initialize();
    }

    private void initialize() {

    TicketsConstructor ticket2and80 = new TicketsConstructor(ticket2_80, count);
    ticketslist.add(ticket2and80);



    }

    public List<TicketsConstructor> getTicketslist() {
        return ticketslist;
    }


}
