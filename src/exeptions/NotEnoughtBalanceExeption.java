package exeptions;

public class NotEnoughtBalanceExeption extends RuntimeException{

    public NotEnoughtBalanceExeption(){
        super("Not enough money to withdraw");
    }

}
