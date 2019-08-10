import java.util.Scanner;
public class ScannerPrac {
	public static void main(String[] args) {
		 // create an object of the class Scanner and variables  Scanner ScannerPrac = new Scanner(System.in);
		Scanner ScanPrac = new Scanner(System.in);
		int online1, online2, online3;
		double focus1, focus2;
		double criticAverage;
		double onlineAverage, focusAverage, overallRating;  //averages stored as variables so 
		//dont have to calculate later
		
		//Input ratings 
		 System.out.println("Please enter ratings from the movie review website.");
		 online1 = ScanPrac.nextInt();
		 online2 = ScanPrac.nextInt();
		 online3=  ScanPrac.nextInt();
		 
		 System.out.println("Please enter the ratings from the focus group");
		 focus1 = ScanPrac.nextDouble();
		 focus2 = ScanPrac.nextDouble();
		 
		 System.out.println("Please enter the critic ratings");
		 criticAverage = ScanPrac.nextDouble();
		 //Calculations
		 onlineAverage = 1.0*( + online1 + online2 + online3)/3;
		 focusAverage = (focus1 + focus2)/2;
		 overallRating = 0.2*onlineAverage + 0.3*focusAverage + 0.5*criticAverage;
		 
		 //Print the results
		  System.out.println ("The online average is" + onlineAverage);
		  System.out.println ("The focus group average is" + focusAverage);
		  System.out.println ("The critic rating average is " + criticAverage);
		  System.out.println ("The overall rating is" + overallRating);
				 
		 
		 
	}

}
/*Milestone 2: Calculate and display (as doubles) the average of the three user ratings, 
the average of the two focus group ratings and the single critic rating value. Hint: 
	store the averages calculated as variables so you don’t need to calculate them again later.
	onlineAverage = 1.0*(online1+online2+online3)/3;
	overallRating = 0.2*onlineAverage + 0.3*focusAverage + 0.5*criticAverage;
	import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // Declare Scanner and variables
        Scanner scan = new Scanner(System.in);
        int online1, online2, online3;
        double focus1, focus2;
        double criticAverage;
        double onlineAverage, focusAverage, overallRating;
/*Milestone 1: Create code which prompts user for input, 
 * taking three int inputs (user ratings), followed by a pair of doubles
 *  (focus group ratings) and a single double (critic rating). 
 All of these should be stored in appropriate variables.
 System.out.println("Please enter ratings from the movie review website.");
			System.out.println("Please enter ratings from the movie review website.");
			System.out.println("Please enter ratings from the movie review website.");
			
			String ratings = NewScannerprac.nextLine();
			System.out.println(ratings);
 */