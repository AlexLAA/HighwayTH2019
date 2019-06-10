package lesson14;

import java.util.Comparator;

/**
 * Created by lolik on 30.05.2019
 */
public class MovieTitlesComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.title.compareTo(o2.title);
    }

}
