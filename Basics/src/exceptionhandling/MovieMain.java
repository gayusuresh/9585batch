package exceptionhandling;

public class MovieMain {

	public static void main(String[] args) throws LowDurationMovieException, NotElgibleForAwardException {
		Movie m1=new Movie("Bahubali","raj",3.4,3.4);
		Movie m2=new Movie("ponniyun selvan","manirathnam",3.0,4.3);
		Movie m3=new Movie("LionKing","john",2.3,4.5);
       System.out.println(m1);
       System.out.println(m2);
       System.out.println(m3);
       System.out.println("===============================");
       checkMovie(m1);
	}
	
	public static void checkMovie(Movie m) 
	{
		if(m.getDuration()<3.5 && m.getRating()<4.0)
		{
			try
			{
				
				try
				{
					throw new NotElgibleForAwardException("Noteligibleforaward");
				}
				catch(NotElgibleForAwardException e)
				{
					System.out.println(e);
				}
				throw new LowDurationMovieException("Low duration");
			}
			catch(LowDurationMovieException e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println(m.getMoviename());
		}
	}

}
