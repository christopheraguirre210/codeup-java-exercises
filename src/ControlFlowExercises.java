import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

//        for (int i = 5; i <= 15; i++) {
//            System.out.println("i is " + i);
//        }

//        for(long i = 2; i < 1000000; i*=i) {
//            System.out.println(i);
//        }

//        for(int i = 1; i < 100; i++){
//            if(i % 15 == 0){
//                System.out.println("FizzBuzz");
//            }else if(i % 5 == 0){
//                System.out.println("Buzz");
//            }else if(i % 3 == 0){
//                System.out.println("Fizz");
//            }else{
//                System.out.println(i);
//            }
//        }


        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer");
//        int userinteger = scanner.nextInt();
//
//        System.out.println("Here is your table!");
//        for(int i = 1; i <= userinteger; i++) {
//            int squared = i * i;
//            int cubed = i * i * i;
//
//            System.out.printf("%d   |%d   |%d%n",i, squared, cubed);
//
//            System.out.print("Continue? [y/n] ");
//            String userInput = scanner.next();
//
//            boolean confirmation = userInput.equalsIgnoreCase("y");
//            if(!confirmation){
//                break;
//            }
//        }

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
