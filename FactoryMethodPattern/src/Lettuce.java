/**
 * Created by Aidan on 8/31/2016.
 */
public class Lettuce implements Chow {

    //This class is a ConcreteProduct.

    @Override
    public int calorieCounter() {
        return 5;
    }

    @Override
    public String toString() {
        return "Lettuce";
    }
}
