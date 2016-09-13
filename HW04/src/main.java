/**
 * Created by Aidan on 9/12/2016.
 */
public class main {

    public static void main(String args[]){

        Currency currency1 = new Currency(2);
        Currency currency2 = new Currency(3);

        System.out.println("Comparing Currency magnitudes...");
        System.out.println("currency1 value " + currency1.getAmount() + " is less than currency2 value " + currency2.getAmount() + " " + currency1.lessThan(currency2));
        System.out.println("currency1 value " + currency1.getAmount() + " is less than or equal to currency2 value " + currency2.getAmount() + " " + currency1.lessThanEqualTo(currency2));
        System.out.println("currency1 value " + currency1.getAmount() + " is equal to currency2 value " + currency2.getAmount() + " " + currency1.equalTo(currency2));
        System.out.println("currency1 value " + currency1.getAmount() + " is greater than or equal to currency2 value " + currency2.getAmount() + " " + currency1.greaterThanEqualTo(currency2));
        System.out.println("currency1 value " + currency1.getAmount() + " is greater than currency2 value " + currency2.getAmount() + " " + currency1.greaterThan(currency2));
        System.out.println("currency1 value " + currency1.getAmount() + " is not equal to currency2 value " + currency2.getAmount() + " " + currency1.notEqual(currency2));

        System.out.println();

        CartPoint cartPoint1 = new CartPoint(2);
        CartPoint cartPoint2 = new CartPoint(3);

        System.out.println("cartPoint1 value " + cartPoint1.getDistanceFromOrigin() + " is less than currency2 value " + cartPoint2.getDistanceFromOrigin() + " " + cartPoint1.lessThan(cartPoint2));
        System.out.println("cartPoint1 value " + cartPoint1.getDistanceFromOrigin() + " is less than or equal to currency2 value " + cartPoint2.getDistanceFromOrigin() + " " + cartPoint1.lessThanEqualTo(cartPoint2));
        System.out.println("cartPoint1 value " + cartPoint1.getDistanceFromOrigin() + " is equal to currency2 value " + cartPoint2.getDistanceFromOrigin() + " " + cartPoint1.equalTo(cartPoint2));
        System.out.println("cartPoint1 value " + cartPoint1.getDistanceFromOrigin() + " is greater than or equal to currency2 value " + cartPoint2.getDistanceFromOrigin() + " " + cartPoint1.greaterThanEqualTo(cartPoint2));
        System.out.println("cartPoint1 value " + cartPoint1.getDistanceFromOrigin() + " is greater than currency2 value " + cartPoint2.getDistanceFromOrigin() + " " + cartPoint1.greaterThan(cartPoint2));
        System.out.println("cartPoint1 value " + cartPoint1.getDistanceFromOrigin() + " is not equal to currency2 value " + cartPoint2.getDistanceFromOrigin() + " " + cartPoint1.notEqual(cartPoint2));

    }

}
