import java.util.Scanner;

public class TestingClass {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double x = 0;  //user input initialization
        double product = 1;   //variable to hold product of inputs
        double count = 0;   //counter initalization
        double result = 0;  //result initialization

//        System.out.print("Please enter a number: ");
//        x = keyboard.nextDouble();

        do
        {
            System.out.print("Please enter a number: ");
            x = keyboard.nextDouble();

            if (x > 0)
            {
                product = product * x;
                count = count + 1;
                double power = 1 / count;
                result = Math.pow(product, power);
            }
            else
            {
                System.out.println("Negative measurements cannot be used");
            }
            System.out.printf("The geometric mean of the numbers provided is %.2f\n",
                    result);

        } while (x != 0);

    }
}
