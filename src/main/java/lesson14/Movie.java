package lesson14;

/**
 * Created by lolik on 30.05.2019
 */
public class Movie implements Comparable {

    public String title;
    public int year;
    public double score;

    public Movie(String title, double score, int year){
        this.title = title;
        this.score = score;
        this.year = year;
    }

    public Movie(String title, double score){
       this(title, score, 0);
    }



    @Override
    public int compareTo(Object o) {
        Movie m = (Movie)o;
        return (score < m.score) ? -1 : ((score == m.score) ? 0 : 1);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", score=" + score +
                '}';
    }
}
