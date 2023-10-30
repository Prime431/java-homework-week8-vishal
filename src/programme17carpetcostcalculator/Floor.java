package programme17carpetcostcalculator;

public class Floor {
    double width, length;
    double area;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double getArea(){
        double area = width*length;
        return area;
    }
}
