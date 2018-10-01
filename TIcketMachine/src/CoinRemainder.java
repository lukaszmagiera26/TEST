import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CoinRemainder {
    private BigDecimal remaindner = new BigDecimal("0");
    CoinList coinList = new CoinList();
    CoinChecker coinChecker = new CoinChecker();
    CoinConstructor coinConstructor;
    PrinterCoinList pr = new PrinterCoinList();
    CoinList cl = new CoinList();


    public void HowManyCoinsToRemainder(BigDecimal valueToRemmainder) {
        BigDecimal coinToRemaind = new BigDecimal("0");
        BigDecimal coinToRemainder2 = new BigDecimal("0");

                Collections.sort(coinList.getCoinsList(), new CompId());
        for (CoinConstructor c : coinList.getCoinsList()) {
            if (valueToRemmainder.divide(c.getValue()).compareTo(new BigDecimal("0")) >= 1) {
                coinToRemaind =  valueToRemmainder.divide(c.getValue());
                coinToRemaind = coinToRemaind.setScale(0, RoundingMode.DOWN);
                c.setCount(c.getCount().subtract(coinToRemaind));

                System.out.println(coinToRemaind+"y" + c.getValue() + " " + valueToRemmainder);
                if (valueToRemmainder.remainder(c.getValue()).compareTo(new BigDecimal("0")) > 0) {
                    coinToRemainder2 = valueToRemmainder.remainder(c.getValue());
                    valueToRemmainder = coinToRemainder2;
                } else {
                    break;

                }

            }
            System.out.println(c.getCount()+"KK");
        }
    pr.printer(coinList.getCoinsList());
    }

    public static class CompId implements Comparator<CoinConstructor> {
        public int compare(CoinConstructor arg0, CoinConstructor arg1) {
            return arg1.getValue().compareTo(arg0.getValue());
        }
    }


}