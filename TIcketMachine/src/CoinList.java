import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CoinList {

    private BigDecimal PLN5 = new BigDecimal("5.00");
    private BigDecimal PLN2 = new BigDecimal("2.00");
    private BigDecimal PLN1 = new BigDecimal("1.00");
    private BigDecimal GR50 = new BigDecimal("0.50");
    private BigDecimal GR20 = new BigDecimal("0.20");
    private BigDecimal GR10 = new BigDecimal("0.10");
    private BigDecimal count = new BigDecimal("60");


    private List<CoinConstructor> coinsList = new ArrayList<>();


    {
        initialize();
    }

    private void initialize() {

        CoinConstructor PLN2Coin = new CoinConstructor(PLN2, count);
        CoinConstructor GR50Coin = new CoinConstructor(GR50, count);
        CoinConstructor GR20Coin = new CoinConstructor(GR20, count);
        CoinConstructor GR10Coin = new CoinConstructor(GR10, count);
        coinsList.add(PLN2Coin);
        coinsList.add(GR50Coin);
        coinsList.add(GR20Coin);
        coinsList.add(GR10Coin);

        /*for (CoinConstructor c : coinsList) {
            c.setCount(new BigDecimal("60"));
        }*/

    }
    public List<CoinConstructor> getCoinsList() {
        return coinsList;
    }





}
