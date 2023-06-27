package oops;

public class Movie
{
	private int movieno;
	private String moviename;
	private String director;
	private double duration;
	private double rating;
	private static int idgen=8001;
	public Movie()
	{
		movieno=idgen++;
	}
	public Movie(String moviename, String director, double duration, double rating) {
		this();//default cons
		this.moviename = moviename;
		this.director = director;
		this.duration = duration;
		this.rating = rating;
	}
	public int getMovieno() {
		return movieno;
	}
	public void setMovieno(int movieno) {
		this.movieno = movieno;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [movieno=" + movieno + ", moviename=" + moviename + ", director=" + director + ", duration="
				+ duration + ", rating=" + rating + "]";
	}
	
  
}
