package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            Input input = new Input();

            Circle circle = new Circle(input.getDouble());
            System.out.println("circle.getArea() = " + circle.getArea());
            System.out.println("circle.getCircumference() = " + circle.getCircumference());
            System.out.println("Would you like to make another circle? " + input.yesNo());
            sc.nextLine();

            if(input.yesNo()){
                System.out.println(input.getDouble());
            }

        }
}
