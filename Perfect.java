/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int N = Integer.parseInt(args[0]);
		int sum = 0;
		//Initialize a String for the output.
		String ans = " is a perfect number since " + N + " = 1";
		//A loop in which we will run on all the numbers from 2 to N 
		for(int i = 2; i < N; i++){
			////Check if i is divides of N
			if(N % i == 0){
				// Add i to the String output
				ans = ans + " + " + i ;
				sum += i;
			}
		}
		// Check if N is perfect
		if((sum + 1) == N){
			System.out.println(N + ans);
		} else {
			System.out.println(N + " is not a perfect number");
		}
	}
}
