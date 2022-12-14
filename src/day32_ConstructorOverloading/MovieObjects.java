package day32_ConstructorOverloading;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieObjects {
    public static void main(String[] args) {

    Movie movie1= new Movie("USA","Journey to SDET: Cydeo Batch EU10","Adventure, Comedy, Thriller","10/25/2021","Kuzzat Altay");

    movie1.addCast("Sedat");
    String [] names= {"Asiya", "Adam","Muhtar","Ziya","Osman", "Erkan","Şaban","Emre"};
    movie1.addCasts(names);

    System.out.println(movie1); // Movie{country='USA', title='Journey to SDET: Cydeo Batch EU10',
                                // releaseDate='10/25/2021', total casts= 9}

    }
}
