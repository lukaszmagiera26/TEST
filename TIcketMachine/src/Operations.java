import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class Operations {

    PrinterTicketsPrice printerTicketsPrice = new PrinterTicketsPrice();
    PrinterCoinList printerCoinList = new PrinterCoinList();
    TicketChecker ticketChecker = new TicketChecker();
    Scanner sc = new Scanner(System.in);
    BigDecimal coinPuttedToMachine = new BigDecimal("0");
    BigDecimal sumCoinPuttedToMachine = new BigDecimal("0");
    BigDecimal ticketChoosed = new BigDecimal(0);
    CoinRemainder coinRemainder = new CoinRemainder();
    CoinList coinList = new CoinList();
    CoinConstructor coinConstructor ;
    BigDecimal remainder = new BigDecimal("0");

    public void operations() {


        coinRemainder.HowManyCoinsToRemainder(new BigDecimal("10.20"));
        printerCoinList.printer(coinList.getCoinsList());
        System.out.println("Please prepare and put coins to machine" + "\n ###Tickets which You can Buy : ");
        printerTicketsPrice.printer();
        System.out.println(" ###Coin whish You can put to machine: ");
        printerCoinList.printer(coinList.getCoinsList());
        System.out.println(" >which ticket you choosing?");
        //todo error
        try {
            ticketChoosed = sc.nextBigDecimal();
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("Chosen uncorrect");
        }


        switch (String.valueOf(ticketChoosed)) {
            case "2.80":
                System.out.println("You chosen correct ticket");
                break;
            default:
                System.out.println("You chosen uncorrect ticket");
                ticketChoosed = new BigDecimal("0");
                System.exit(0);
        }


//todo change to timer
        //todo change money
        //todo errors

        while (sumCoinPuttedToMachine.compareTo(ticketChecker.checkerOneTicketfromList(ticketChoosed)) < 0) {

            System.out.println("  >Which money You puting to machine?: ");
            coinPuttedToMachine = sc.nextBigDecimal();

            switch (String.valueOf(coinPuttedToMachine)) {
                case "2.00":
                    System.out.println("correct coin");
                    sumCoinPuttedToMachine = sumCoinPuttedToMachine.add(coinPuttedToMachine);
                    break;

                case "0.50":
                    System.out.println("correct coin");
                    sumCoinPuttedToMachine = sumCoinPuttedToMachine.add(coinPuttedToMachine);
                    break;

                case "0.20":
                    System.out.println("correct coin");
                    sumCoinPuttedToMachine = sumCoinPuttedToMachine.add(coinPuttedToMachine);
                    break;
                case "0.10":
                    System.out.println("correct coin");
                    sumCoinPuttedToMachine = sumCoinPuttedToMachine.add(coinPuttedToMachine);
                    break;
                default:
                    System.out.println("You put uncorrect coin. Try again");
                    coinPuttedToMachine = new BigDecimal("0.00");
                    break;
            }
            if (ticketChecker.checker(sumCoinPuttedToMachine)) {
                System.out.println("Correct Vale - Ticket  " + ticketChoosed + "  it will be print");
            }

            remainder = sumCoinPuttedToMachine.subtract(ticketChoosed);

            System.out.println("You can take Your remainder= "  );

            coinRemainder.HowManyCoinsToRemainder(remainder);

        }


    }


}
