import java.math.BigDecimal;

public class CoinChecker {
    CoinList coinList = new CoinList();
    CoinConstructor coinConstructor;

    public boolean checker(BigDecimal coinPutted){
        boolean result = false;
        for (CoinConstructor coinConstructor : coinList.getCoinsList()) {
            if (coinConstructor.equals(coinPutted)){
                result = true;
            }

        }
        return result;
    }


    public BigDecimal checkerOneCoinfromList(BigDecimal coinChoosed){
        for (CoinConstructor coinConstructor : coinList.getCoinsList() ) {
            if (coinConstructor.getValue().equals(coinChoosed)){
                return coinConstructor.getValue();
            }
        }
        return null;
    }




}

