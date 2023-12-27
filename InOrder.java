/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//Generate the first random number
		int random1 = (int)(Math.random() * 10);
		//Initialize a variable to save the previous random number 
		int check = 0;
		//A loop in which we generate random numbers until the privious number is grater then the new one
		while(check <= random1){
			System.out.print(random1 + " ");
			check = random1;
			random1 = (int)(Math.random() * 10);
		}
	}
}
