package shapes;

public class Square extends Rectangle {

    public Square(double side){
        super(side, side);
    }

    @Override
    public double getPerimeter(){
        return 4 * super.length;
    }

    @Override
    public double getArea(){
//        both of these answers below will work;
        return super.length * super.width;
//        return Math.pow(super.length, 2);
    }



}
