package com.hashedin.movie.moviebuff;


import java.util.List;
import java.util.Map;
import java.util.Set;

import com.hashedin.movie.models.*;
import com.hashedin.movie.parser.*;

/**
 * 
 * @author avinash
 *
 */
public class MovieManager {

public static void main(String args[])
{
	MDBParser mdb=new FileParser("movie.data","user.data","ratings.data","genre.data");
	MovieBuff movieBuff=new MovieBuff(mdb.getMovieDatabase());
	
	DisplayResults display=new DisplayResults();
	
	
	
	List<Genre> genre=movieBuff.getMostWathedGenre();
	System.out.println("Most Watch Genre");
	display.displayGenreList(genre);
	
	List<Movie>mostWatchedMovies=movieBuff.getMostWatchedMovie();
	System.out.println("Most Watched Movies--");
	display.displayMostWatchedMovie(mostWatchedMovies);
	
	Map<Integer,List<Movie>>topMovieByYear=movieBuff.getTopMovieByYear();
	System.out.println("Top Movie By Year");
	display.displayTopMovieByYear(topMovieByYear);
	
	

	List<User> mostActiveUser=movieBuff.getMostActiveUser();
	System.out.println("Most Active User");
	display.displayUserList(mostActiveUser);
	
	Set<Genre> genreSet=movieBuff.getHighestRatedGenre();
	System.out.println("Highest Rating Genre");
    display.displayGenreSet(genreSet);
	
	
}


}