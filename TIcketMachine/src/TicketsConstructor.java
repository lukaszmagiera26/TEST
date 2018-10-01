import java.math.BigDecimal;

public class TicketsConstructor {

    private BigDecimal ticket = new BigDecimal("0");
    private BigDecimal count = new BigDecimal("0");

    public TicketsConstructor(BigDecimal ticket, BigDecimal count) {
        this.ticket = ticket;
        this.count = count;
    }

    public BigDecimal getTicket() {
        return ticket;
    }



    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "tiket: " + ticket + "count: " + count ;
    }
}
