package programme19cylinder;

public class Cylinder extends Circle {
    double height;

    Cylinder(double radius, double height){
        super(height);


    }
    public double getHeight(){

        return height;
    }
    public double getVolume(){

        return(getArea()*height);
    }

}
