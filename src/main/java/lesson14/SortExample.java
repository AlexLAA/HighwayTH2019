package lesson14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by lolik on 30.05.2019
 */
public class SortExample {


    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("AZ", 5.4));
        movies.add(new Movie("AB", 2.6));
        movies.add(new Movie("AC", 6.4));
        movies.add(new Movie("AD", 7.4));
        movies.add(new Movie("AE", 10.0));
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        System.out.println("SORTING");
        Collections.sort(movies);
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        // Сортируем фильмы по Названию
        Collections.sort(movies, new MovieTitlesComparator());
        System.out.println(movies);
        // Сортируем фильмы по Оценке
        Collections.sort(movies, new MovieScoreComparator());
        System.out.println(movies);



    }
}
