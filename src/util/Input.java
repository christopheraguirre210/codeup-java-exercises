package util;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString());
        System.out.println(input.yesNo());

    }

    private Scanner sc = new Scanner(System.in);

    public String getString() {
        return sc.nextLine();
    }

    public Boolean yesNo() {
        System.out.println("[y/n]");
        String userAnswer = sc.nextLine();
        if (userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.println("Please Enter a number");
        int inputNum = getInt();
        if (inputNum < min) {
            return getInt(min, max);
        } else if (inputNum > max) {
            return getInt(min, max);
        }
        return inputNum;
    }

    public int getInt(){
        System.out.println("Give me a number");
        return Integer.parseInt(getString());
    }


}
