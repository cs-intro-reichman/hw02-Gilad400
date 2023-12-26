/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int random1 = (int)(Math.random() * 10);
		int check = 0;
		
		while(check <= random1){
		System.out.print(random1 + " ");
		check = random1;
		random1 = (int)(Math.random() * 10);
		}
	}
}
