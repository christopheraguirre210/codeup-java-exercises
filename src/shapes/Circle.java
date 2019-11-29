package shapes;

import util.Input;

class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle(input.getDouble());
        System.out.println("circle.getArea() = " + circle.getArea());
        System.out.println("circle.getCircumference() = " + circle.getCircumference());
    }
}

public class Circle {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * (radius * radius);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
}
