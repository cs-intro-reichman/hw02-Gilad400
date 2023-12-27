/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		String stars = "";
		//A loop that build the row
		//and make sure that we donwt have an extra space at the end
		for(int i = 0; i < n-1; i++){
			stars = stars + "* ";
		}
		//without space at the and of the row
		stars = stars + "*";
		//A loop that build the board by build a n rows
		//and make sure that if the row is odd we have extra space at the beginning
		for(int j = 0; j < n; j++){
			if(j % 2 != 0){
				System.out.print(" ");
				System.out.println(stars);
			} else{
				System.out.println(stars + " ");
			}
		}
	}
}
