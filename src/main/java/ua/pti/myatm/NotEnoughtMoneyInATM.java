package ua.pti.myatm;

/**
 * Created by Alex on 11/24/15.
 */
public class NotEnoughtMoneyInATM extends Exception{
    public NotEnoughtMoneyInATM() {
        super("Not Enought Money In ATM");
    }
}
