package moviedriver;

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
	
{
		        Scanner scanner = new Scanner(System.in); //Promt to enter character
		        Movie movie = new Movie();
		        System.out.print("Enter the title of the movie: \n"); //Accept character
		        String title = scanner.nextLine();
		        movie.setTitle(title);//Hold movie title
		        System.out.print("Enter the movie's rating:\n ");
		        String rating = scanner.nextLine();
		        movie.setRating(rating);
		        System.out.print("Enter the number of tickets sold at the theater:\n "); //Display character
		        int soldTickets = scanner.nextInt(); //next line
		        movie.getSoldTickets();

		        System.out.println("The movie details are: ");
		        System.out.println(movie);
		    }
		
	}
}