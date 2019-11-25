import java.util.Scanner;
import  java.lang.Math;

public class MethodsExercises<a> {

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
            for(int i = 1; i <= num; i++){
                long factorSolution = 1;
                String message = i + "! = ";

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

            System.out.println("Do you want to continue? (y/n)");
            Scanner userCon = new Scanner(System.in);
            String userCont = userCon.next();

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

    public static int randomNumber(int number){
        return (int) (Math.random() * (number)) + 1;
    }

    public static void diceRoll(){
       Scanner sc = new Scanner(System.in);

       System.out.println("How many sides do these dice have?");
       int sides = sc.nextInt();

       if(sides > 6){
           System.out.println("We use normal dice here, kid\nTry again:");
           diceRoll();
       }else if(sides < 1){
           System.out.println("Take this serious!\nTry again:");
           diceRoll();
       }else{
           int dice = randomNumber(sides);
       }


    }

    public static void adventureGame(){
        int mageHealth = (int) (Math.random() * 20) + 50;

        int mageAttack = (int) (Math.random() * 10) + 10;

        int mageMana = (int) (Math.random() * 30) + 70;

        int warriorHealth = (int) (Math.random() * 20) + 80;

        int warriorAttack = (int) (Math.random() * 10) + 20;

        int warriorDefense = (int) (Math.random() * 20) + 60;

        int goblinHealth = (int) (Math.random() * 20) + 20;

        int goblinAttack = (int) (Math.random() * 5) + 5;

        int fighterClassNum = 0;
        String fighterClass;

        int health;
        int mana;
        int attack;
        int defense;


        System.out.println("Would you like to go on an adventure?");
        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine().toLowerCase();
        if (userInput.equals("y") || userInput.equals("yes")) {
            System.out.println("Let's begin");
            System.out.println("What is your name, warrior?");
            String userName = sc.nextLine().toLowerCase();
            System.out.println("Welcome " + userName);
            System.out.println("Choose your class: Press 1 for mage or 2 for warrior!");
            fighterClassNum = sc.nextInt();
        }
        if (fighterClassNum == 1) {
            fighterClass = "Mage";
            health = mageHealth;
            mana = mageMana;
            attack = mageAttack;
            defense = 0;
            System.out.println("You have chosen " + fighterClass + '.');
            System.out.println("Your stats are\nHealth: " + health + "\n" + "Mana: " + mana + "\n" + "Attack: " + attack + "\n" + "Defense: " + defense);
        } else if (fighterClassNum == 2) {
            fighterClass = "Warrior";
            health = warriorHealth;
            mana = 0;
            attack = warriorAttack;
            defense = warriorDefense;
            System.out.println("You have chosen " + fighterClass + '.');
            System.out.println("Your stats are\nHealth: " + health + "\n" + "Mana: " + mana + "\n" + "Attack: " + attack + "\n" + "Defense: " + defense);
        }
        if(fighterClassNum > 0){
//            health = 0;
            System.out.println("Let us begin. You are traveling along a cobblestone road and you are approached by an ugly looking goblin. It snarls at you menacingly and draws it's weapon.");
            System.out.println("Would you like to fight the goblin or attempt to reason?");
            sc.nextLine();
            String answer = sc.nextLine();
            System.out.println(health);
            if (answer.equalsIgnoreCase("reason")) {
                System.out.println("There is no reasoning with a beast like this");
                System.out.println("The goblin is angered at your disgusting human voice and lunges at you with its club, dealing " + goblinAttack + " damage. Your health is now " + (health - goblinAttack + "!"));
                sc.nextLine();
                answer = "fight";
            }
            if (answer.equalsIgnoreCase("fight")) {

            }
        }


    }



    public static void main(String[] args) {
//        addition(2,2);
//        subtraction(5,2);
//        multiplication(5,2);
//        division(10,2);
//        modulus(10,3);
//        getInteger(1,10);
//        factorial(5);
//        diceRoll();
        adventureGame();
    }
}
