import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");


        System.out.print("Do you want to talk to Bob? [y/n] ");
        String confirm = scanner.next();

        boolean convoConfirm = confirm.equalsIgnoreCase("y");
        scanner.nextLine();
        if (convoConfirm) {
            do {
                System.out.println("What do you want to tell Bobby?");
                String input = scanner.nextLine();
                if (input.endsWith("?")) {
                    System.out.println("Sure");
                } else if (input.endsWith("!")) {
                    System.out.println("Whoa, chill out!");
                } else if (input.equals("")) {
                    System.out.println("Fine. Be that way!");
                } else {
                    System.out.println("Whatever dude");
                }
                System.out.println("Anything else?");
                input = scanner.next();
                convoConfirm = input.equalsIgnoreCase("y");
                scanner.nextLine();
            } while (convoConfirm);
        }

//        String userInput;
//        boolean greeting;
//
//        do{
//            userInput = scanner.nextLine();
//            greeting = (!userInput.equalsIgnoreCase("bye"));
//
//            if(userInput.endsWith("?")){
//                System.out.println("Sure");
//            }else if (userInput.endsWith("!")){
//                System.out.println("Whoa, Chill out!");
//            }else if(userInput.trim().equals("")){
//                System.out.println("Fine. Be that way!");
//            }else{
//                System.out.println("Whatever");
//            }
//        }while(greeting);

    }
}
