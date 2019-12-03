import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] nouns = {"Dog", "Cat", "Europe", "Water", "Fire", "Chris", "Bryan", "Karli", "Puppy", "Kitten"};

        String[] adjectives = {"Scary", "Nice", "Angry", "Cold", "Hot", "Tasty", "Jagged", "Quick", "Vicious", "Kind"};


        System.out.println("Your server name is:\n" + randomName(adjectives) + "-" + randomName(nouns));
    }

    public static String randomName(String[] arrayString){
        Random rando = new Random();

        int index = rando.nextInt(arrayString.length);
        return arrayString[index];
    }
}
