import java.util.Scanner;
public class ConsoleExercises {

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        scanner.useDelimiter("-");
//        String str = scanner.next();
//        System.out.println(str);
//    }

    public static void main(String[] args){

        double pi = 3.14159;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("The value of pi is approximately %.2f%n", pi);

        System.out.println("Enter a number");
        int input = scanner.nextInt();

        System.out.printf("%d \n", input);

        System.out.println("Put in three words");

        String first = scanner.next();
        String second = scanner.next();
        String third = scanner.next();

        System.out.println(first + " "  + second + " " + third);

        scanner.nextLine();
        System.out.println("Enter a Sentence");

        String sentence = scanner.nextLine();
        System.out.printf("You entered: %s%n", sentence);

//        scanner.nextLine();

//        System.out.println("Enter length and width of the classroom.");
//
//        int length = Integer.parseInt(scanner.nextLine());
//        int width = Integer.parseInt(scanner.nextLine());
//
//        int area = (length * width);
//        int perimeter = ((length * 2) + (width * 2));
//        System.out.printf("The area is %d \n", area);
//        System.out.printf("The perimeter is %d \n", perimeter);

        System.out.println("~~~~~~");
        System.out.println("What is the length of the room?");
        String lengthStr = scanner.nextLine();
        float length = Float.parseFloat(lengthStr);
        System.out.println("What is the width of the room?");
        String widthStr = scanner.nextLine();
        float width = Float.parseFloat(widthStr);

        System.out.printf("The perimeter of the classroom is : %.2f units.%n", 2 * width + 2 * length);
        System.out.printf("The area of the classroom is : %.2f units squared.%n", width * length);

    }
}
