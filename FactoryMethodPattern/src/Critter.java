/**
 * Created by Aidan on 8/31/2016.
 */
public abstract class Critter {

    //This class is the Creator.

    /*Three things to be a Factory Method Design Pattern
    1.) Return a new object.
    2.) Return an instance of a type.
    3.) Be (intended to be) implemented by multiple derived classes.
    */

    public void eat(){
        //By making food be required to be Chow, we are promoting dependence on a type and not implementation.
        Chow food = makeChow();
        omNomNom(food);
    }

    //Define an interface for creating an object. Let Subclasses decide which class to instantiate.
    //Defer creation to subclasses by making method abstract. "Faking" overridable constructors.
    //In this exaple, The Creator is abstract and declares FM, as an abstract implementation. ConcreteCreators override it.
    public abstract Chow makeChow();

    public void omNomNom(Chow chow){
        System.out.println(this.toString() + " is eating the yummy " + chow.toString() + " which has " + chow.calorieCounter() + " calories.");
    }

}
