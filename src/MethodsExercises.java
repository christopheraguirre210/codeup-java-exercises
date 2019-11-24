import java.util.Scanner;

public class MethodsExercises {

    public static void addition(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public static void subtraction(int num1, int num2){
        System.out.println(num1 - num2);
    }

    public static void multiplication(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public static void division(int num1, int num2){
        System.out.println(num1 / num2);
    }

    public static void modulus(int num1, int num2){
        System.out.println(num1 % num2);
    }

    public static void getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int inputNum = scanner.nextInt();
        if(inputNum >= min && inputNum <= max){
            System.out.println("That works for me");
        }else{
            System.out.println("Your number is not in range");
            getInteger(min,max);
        }
    }

    public static void factorial(int num){

        ////// BOOLEAN USED FOR USER CONTINUE LATER ///////

        boolean userContinue = true;

        do {

            //////// OUTER FOR LOOP //////

            for(int i = 1; i <= num; i++){

                long factorSolution = 1;

                String message = "" + i + "! = ";


                ////// INNER FOR LOOP //////////

                for(int x = 1; x <= i; x++){

                    if(i == x){

                        factorSolution *= x;

                        message += x;

                        continue;
                    }

                    factorSolution *= x;

                    message += x + " x ";

                }

                message += " = " + factorSolution;

                System.out.println(message);

            }

            /////////// USER CONTINUE CONDITIONAL ////////

            System.out.println("Do you want to continue? (y/n)");

            Scanner userCon = new Scanner(System.in);

            String userCont = userCon.next();

            /////////// IF/ELSE FOR USER CONTINUE ////////

            if(userCont.equals("y")){

                System.out.println("Choose a new number to factorial: ");

                int newUserInt = userCon.nextInt();

                num = newUserInt;

                userContinue = true;

            }else{

                userContinue = false;
            }

            //////// USER CONTINUE BEGINS AT FALSE, WILL ONLY RUN AGAIN IF USER ENTERS "y" //////

        }while(userContinue);
    }



    public static void main(String[] args) {
//        addition(2,2);
//        subtraction(5,2);
//        multiplication(5,2);
//        division(10,2);
//        modulus(10,3);
//        getInteger(1,10);
        factorial(5);


    }
}
