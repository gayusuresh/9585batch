package sortcollection;

import java.util.HashSet;
import java.util.TreeSet;

public class MovieMain {

	public static void main(String[] args) {
		Movie m1=new Movie("Bahubali","raj",3.4,4.2);
		Movie m2=new Movie("ponniyun selvan","manirathnam",3.0,4.3);
		Movie m3=new Movie("LionKing","john",2.3,4.5);
       TreeSet<Movie>set=new TreeSet<Movie>();
       set.add(m1);
       set.add(m2);
       set.add(m3);
       for(Movie m:set)
       {
    	   System.out.println(m);
       }
	}

}
