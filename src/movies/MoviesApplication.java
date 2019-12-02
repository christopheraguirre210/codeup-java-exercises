package movies;
import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {

        Input input = new Input();
        Scanner sc = new Scanner(System.in);

        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - view movies in the musical category\n" +
                "7 - view movies in the comedy category\n" +
                "\n" +
                "Enter your choice");
        int userInput = input.getInt();

        Movie[] newMovieArray = MoviesArray.findAll();


            if (userInput == 1) {
                for (Movie movie : newMovieArray) {
                    System.out.printf("%s..a %s\n", movie.getMovieName(), movie.getMovieCategory());
                }
            } else if (userInput == 2) {
                for (Movie movie : newMovieArray) {
                    if (movie.getMovieCategory().equalsIgnoreCase("animated")) {
                        System.out.println(movie.getMovieName());
                    }
                }
            } else if (userInput == 3) {
                for (Movie movie : newMovieArray) {
                    if (movie.getMovieCategory().equalsIgnoreCase("drama")) {
                        System.out.println(movie.getMovieName());
                    }
                }
            } else if (userInput == 4) {
                for (Movie movie : newMovieArray) {
                    if (movie.getMovieCategory().equalsIgnoreCase("horror")) {
                        System.out.println(movie.getMovieName());
                    }
                }
            } else if (userInput == 5) {
                for (Movie movie : newMovieArray) {
                    if (movie.getMovieCategory().equalsIgnoreCase("scifi")) {
                        System.out.println(movie.getMovieName());
                    }
                }
            } else if (userInput == 6) {
                for (Movie movie : newMovieArray) {
                    if (movie.getMovieCategory().equalsIgnoreCase("musical")) {
                        System.out.println(movie.getMovieName());
                    }
                }
            } else if (userInput == 7) {
                for (Movie movie : newMovieArray) {
                    if (movie.getMovieCategory().equalsIgnoreCase("comedy")) {
                        System.out.println(movie.getMovieName());
                    }
                }
            }else if(userInput == 0){
                System.out.println("Thank you!");
            }else{
                System.out.println("Please select a valid selection");
            }


    }


}
