/**
 * Created by Aidan on 9/12/2016.
 */
public class CartPoint extends Magnitude {

    private double distanceFromOrigin;

    public CartPoint(double distanceFromOrigin) {
        this.distanceFromOrigin = distanceFromOrigin;
    }

    @Override
    public boolean lessThan(Magnitude m) {
        CartPoint c = (CartPoint)m;
        if(distanceFromOrigin < c.getDistanceFromOrigin())
            return true;
        return false;
    }

    public double getDistanceFromOrigin() {
        return distanceFromOrigin;
    }

    public void setDistanceFromOrigin(double distanceFromOrigin) {
        this.distanceFromOrigin = distanceFromOrigin;
    }
}
