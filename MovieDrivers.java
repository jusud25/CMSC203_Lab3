package moviedriver;

import java.util.Scanner;

public class MovieDrivers {

	public static void main(String[] args) {
	    Scanner book=new Scanner(System.in);                                 //creating scanner object
	       Movie m2=new Movie();                                          //creating movie object
	       while(true) {                                                 //while loop to get number of movie input
	       System.out.println("Enter the name of a movie ");              //asking user for movie name
	       String title=book.nextLine();
	       m2.setTitle(title);
	       System.out.println("Enter the rating of the movie");               //asking user to enter movie title
	       String rating=book.nextLine();
	       m2.setRating(rating);
	       System.out.println("Enter the number of tickets sold for this movie");   //asking user to enter number of tickets
	       int soldTickets=Integer.parseInt(book.nextLine());
	       m2.setSoldTickets(soldTickets);
	       System.out.println(m2.toString());                                       //printing movie data
	       System.out.println("Do you want to enter another? (y or n)");
	       String option =book.nextLine();
	       if(option.equalsIgnoreCase("y"))                                           //if user enter y loop will continue
	        
	    	continue;
	       else
	           break;                                                                     //else it will break
	       }
	       System.out.println("Goodbye");
	   }


	}


