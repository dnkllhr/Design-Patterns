/**
 * Created by Aidan on 8/31/2016.
 */
public class Tiger extends Critter {

    //This class is a ConcreteCreator.

    @Override
    public Chow makeChow() {
        return new Meat();
    }

    @Override
    public String toString(){
        return "Tiger";
    }

}
