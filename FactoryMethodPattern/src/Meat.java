/**
 * Created by Aidan on 8/31/2016.
 */
public class Meat implements Chow {

    //This class is a ConcreteProduct.

    @Override
    public int calorieCounter() {
        return 122;
    }

    @Override
    public String toString() {
        return "Meat";
    }

}
