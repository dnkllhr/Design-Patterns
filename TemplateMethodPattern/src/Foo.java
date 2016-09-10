/**
 * Created by Aidan on 9/10/2016.
 */
public abstract class Foo {

    //For now the basic idea is that you define the skeleton of an algorithm
    // in an operation deferring some steps to subclasses.
    // Template Method lets subclasses redefine certain steps
    // of an algorithm without changing the algorithm’s structure.

    public abstract void bar();

    public void foo(){
        bar();
    }

}
