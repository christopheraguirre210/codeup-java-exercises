package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//
//        System.out.println("getPerimeter(box1) = " + box1.getPerimeter());
//        System.out.println("getArea(box1) = " + box1.getArea());
//
//        Square box2 = new Square(5);
//
//        System.out.println("getPerimeter(box2) = " +box2.getPerimeter());
//        System.out.println("getArea(box2) = " + box2.getArea());


        Measurable myShape;

        myShape = new Square(5);
        myShape = new Rectangle(5,4);

        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

    }
    }
//}
