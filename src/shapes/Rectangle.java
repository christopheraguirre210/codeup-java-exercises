package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

//    protected double length;
//    protected double width;
//    public static byte numberOfSides = 4;
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//
//    }

    @Override
    public  double getArea(){
        return this.length * this.width;
    }

    @Override
    public  double getPerimeter(){
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}
