import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println("i is " + i);
            i++;
        }


        long x = 2;
        do {
            System.out.println(x);
            x *= i;
        } while (x < 1000000);

        for(int a = 100; a <= 100; a+=2){
            System.out.println(a);
        }


        for (int j = 5; j <= 15; j++) {
            System.out.println("j is " + j);
        }


        for(long a = 2; a < 1000000; a*=a) {
            System.out.println(a);
        }


        for(int b = 1; b < 100; b++){
            if(b % 15 == 0){
                System.out.println("FizzBuzz");
            }else if(b % 5 == 0){
                System.out.println("Buzz");
            }else if(b % 3 == 0){
                System.out.println("Fizz");
            }else{
                System.out.println(b);
            }
        }

//Table of Powers

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int userinteger = scanner.nextInt();

        System.out.println("Here is your table!");
        System.out.println("Number|Squared|Cubed");

        for(int z = 1; z <= userinteger; z++) {
            int squared = z * z;
            int cubed = z * z * z;

            System.out.printf("%d   |%d   |%d%n",z, squared, cubed);

            System.out.print("Continue? [y/n] ");
            String userInput = scanner.next();

            boolean confirmation = userInput.equalsIgnoreCase("y");
            if(!confirmation){
                break;
            }
        }



        System.out.print("Do you want me to check your score? [y/n] ");
        String testInput = scanner.next();

        boolean testConfirmation = testInput.equalsIgnoreCase("y");
        if(testConfirmation){
            do {
                System.out.println("What did you make on your test");
                int grade = scanner.nextInt();
                if (grade >= 88) {
                    System.out.println("That's an: A");
                } else if (grade >= 80) {
                    System.out.println("That's a: B");
                } else if (grade >= 67) {
                    System.out.println("That's a: C");
                } else if (grade >= 60) {
                    System.out.println("That's a: D");
                } else {
                    System.out.println("That's an: F");
                }
                System.out.println("more grades?");
                testInput = scanner.next();
                testConfirmation = testInput.equalsIgnoreCase("y");
            }while (testConfirmation);
    }








    }
}
