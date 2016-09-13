/**
 * Created by Aidan on 9/12/2016.
 */
public abstract class Magnitude {

    //will return true if this is less than m false otherwise
    public abstract boolean lessThan(Magnitude m);

    //will return true if this is less than or equal to m false otherwise
    public final boolean lessThanEqualTo(Magnitude m){
        if(this.lessThan(m) || this.equalTo(m))
            return true;
        return false;
    }

    //will return true if this is equal to m false otherwise
    public final boolean equalTo(Magnitude m){
        if(!this.lessThan(m) && !this.greaterThan(m))
            return true;
        return false;
    }

    //will return true if this is greater than or equal to m false otherwise
    public final boolean greaterThanEqualTo(Magnitude m){
        if(this.greaterThan(m) || this.equalTo(m))
            return true;
        return false;
    }

    //will return true if this is greater than m false otherwise
    public final boolean greaterThan(Magnitude m){
        if(this.notEqual(m) && !this.lessThan(m))
            return true;
        return false;
    }

    //will return true if this is not equal to m false otherwise
    public final boolean notEqual(Magnitude m){
        if(this.lessThan(m) || this.greaterThan(m))
            return true;
        return false;
    }
}
