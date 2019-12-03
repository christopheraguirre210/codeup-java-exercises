package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);

        System.out.println("getPerimeter(box1) = " + box1.getPerimeter());
        System.out.println("getArea(box1) = " + box1.getArea());

        Square box2 = new Square(5);

        System.out.println("getPerimeter(box2) = " +box2.getPerimeter());
        System.out.println("getArea(box2) = " + box2.getArea());
    }
}
