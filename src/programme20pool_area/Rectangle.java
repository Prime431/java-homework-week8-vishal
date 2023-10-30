package programme20pool_area;

public class Rectangle {
    double width, length;
    double area;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        if(width<0){
            width=0;
        }
        if(length<0)
            length=0;
    }
    public double getWidth(){

        return width;
    }
    public double getLength(){

        return length;
    }
    public double getArea(){

        double area = 0;
        return area = width*length;
    }

}
