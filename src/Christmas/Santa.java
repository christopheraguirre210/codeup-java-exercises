package Christmas;

import java.util.Scanner;

public class Santa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What would you like for Christmas?");

        String UserInput = sc.nextLine();

        System.out.println("You want a " + UserInput + "?");

        String SantaQuestion = "Have you been good this year? [y/n]";
        System.out.println(SantaQuestion);

        String Response = sc.nextLine();
        while(Response.equals("") || Response == null){
            System.out.println(SantaQuestion);
            Response = sc.nextLine();
        }

        boolean GoodResponse = Response.equalsIgnoreCase("y") || Response.equalsIgnoreCase("yes");




    }
}
