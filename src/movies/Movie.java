package movies;

import util.Input;
import java.util.Arrays;

public class Movie {

    private String name;
    private String category;

    //    Constructor for the movie method
    public Movie(String nameExternal, String categoryExternal) {
        this.name = nameExternal;
        this.category = categoryExternal;

    }

    //    below is the two getters for the movie name and category
    public String getMovieName() {
        return this.name;
    }

    public String getMovieCategory() {
        return this.category;
    }

    //    below is the two setters for the movie name and category
    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

//    add a movie method
//    public void Movie[] addMovie()


    public static void main(String[] args) {

    }
}
