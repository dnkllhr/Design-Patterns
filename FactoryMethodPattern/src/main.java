/**
 * Created by Aidan on 8/31/2016.
 */
public class main {

    //This is an example of Unparameterized Factory Method.

    public static void main(String args[]){

        Critter bunny = new Bunny();
        Critter tiger = new Tiger();

        bunny.eat();
        tiger.eat();

    }

}
