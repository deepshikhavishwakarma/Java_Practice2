package CodePractice2.Codeday43_Collection;

//public class Code43_Set {
//}
import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Comparator;

class Code43_Set1 implements Comparator
{
    public int compare(Movie one, Movie two)
    {
        return one.getGenre().compareTo(two.getGenre());
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
class Movie implements Comparable
{
    String title;
    String genre;
    String leadActor;
    Movie(String t, String g, String a)
    {
        title = t;
        genre = g;
        leadActor = a;
    }
    public String toString()
    {
        return title + " " + genre + " " + leadActor + "\n";
    }
    public int compareTo(Movie d)
    {
        return title.compareTo(d.getTitle());
    }
    public String getTitle()
    {
        return title;
    }
    public String getGenre()
    {
        return genre;
    }
    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
public class Code43_Set
{
    public static void main(String[] args)
    {
        ArrayList dvdlist = new ArrayList();
        System.out.println(dvdlist);
        Collections.sort(dvdlist);
        System.out.println(dvdlist);
        Code43_Set1 gs = new Code43_Set1();
        Collections.sort(dvdlist, gs);
        System.out.println(dvdlist);
    }
}


