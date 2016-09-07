/**
 * Created by Aidan on 8/31/2016.
 */
public class Bunny extends Critter {

    //This class is a ConcreteCreator.

    @Override
    public Chow makeChow() {
        return new Lettuce();
    }

    @Override
    public String toString(){
        return "Bunny";
    }

}
