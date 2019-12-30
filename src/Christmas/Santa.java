package Christmas;

import java.lang.reflect.Array;
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

//        Reindeer reindeer1 = new Reindeer("Dasher");
//        System.out.println(reindeer1.name);

        Reindeer[] Reindeers = new Reindeer[10];
        Reindeers[0] = new Reindeer("Dasher");
        Reindeers[1] = new Reindeer("Dancer");
        Reindeers[2] = new Reindeer("Prancer");
        Reindeers[3] = new Reindeer("Vixen");
        Reindeers[4] = new Reindeer("Comet");
        Reindeers[5] = new Reindeer("Cupid");
        Reindeers[6] = new Reindeer("Donner");
        Reindeers[7] = new Reindeer("Blitzen");
        Reindeers[8] = new Reindeer("Rudolf");
        Reindeers[9] = new Reindeer("Olive");

        for(Reindeer deer: Reindeers){
            System.out.println(deer.getName());
        }

    }



}
