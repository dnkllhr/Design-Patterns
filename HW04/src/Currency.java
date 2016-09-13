/**
 * Created by Aidan on 9/12/2016.
 */
public class Currency extends Magnitude {

    private double amount;

    public Currency(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean lessThan(Magnitude m) {
        Currency c = (Currency)m;
        if(amount < c.getAmount())
            return true;
        return false;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
