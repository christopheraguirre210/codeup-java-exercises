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
        return super.length * super.width;
    }



}
