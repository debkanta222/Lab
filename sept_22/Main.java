//Movie Theatre Management System, where you can create two classes one is main another one is movie, 
//movie class can have two methods setMovie, getMovie where you can create movieName, movieStartTime, movieEndTime, MovieTicketPrice as instance variables.
 

package Lab;

import java.util.*;
class Movie{
	 
private double movieStartTime;
private String movieName;
private double movieEndTime;
private float MovieTicketPrice;
public String getMovie() {
	return movieName+" "+movieStartTime+" "+ movieEndTime+" "+MovieTicketPrice;
}

public void setMovie(String movieName,	double movieStartTime, double movieEndTime,	float MovieTicketPrice) {
	this.movieName=movieName;
	this.movieStartTime=movieStartTime;
	this.movieEndTime=movieEndTime;
    this.MovieTicketPrice = MovieTicketPrice;
}
}
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Movie m=new Movie();
		m.setMovie("Iron man"   ,7.00   ,9.30   , 250);
		System.out.println(m.getMovie());
		
	}

}
