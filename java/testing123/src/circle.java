/**
 * Created by Ashraful on 03-Apr-18.
 */
public class circle {
    private double rad;

    public circle(){

    }

    public void setradius(double rad){
        this.rad=rad;
    }

    public double getRad(){
        return this.rad;
    }

    public double getarea(){
        return Math.PI*rad*rad;
    }
}
