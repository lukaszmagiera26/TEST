import java.math.BigDecimal;
import java.util.Objects;

public class CoinConstructor {




    private BigDecimal value;
    private BigDecimal count;

      public CoinConstructor(BigDecimal value, BigDecimal count) {
        this.value = value;
        this.count = count;
    }

    public CoinConstructor(BigDecimal value) {
        this.value = value;

    }





    public BigDecimal getValue() {
        return value;
    }


    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

//todo hashcode?




    @Override
    public String toString() {
        return "value: " + value + " count: " + count;
    }
}
