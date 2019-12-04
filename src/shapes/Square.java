package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    @Override
    protected void setLength(double length) {

    }

    @Override
    protected void setWidth(double width) {

    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }


//    public Square(double side){
//        super(side, side);
//    }
//
//    @Override
//    public double getPerimeter(){
//        return 4 * super.length;
//    }
//
//    @Override
//    public double getArea(){
////        both of these answers below will work;
//        return super.length * super.width;
////        return Math.pow(super.length, 2);
//    }



}
