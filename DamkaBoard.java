/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		//for(int i = 0; i < n; i++){
			//if(i % 2 != 0){
			//	System.out.print(" ");
			//}
			//for(int j = 0; j < n; j++){
			//	System.out.print("* ");
			//}
		//System.out.println();
		//}
		
		String stars = "";
		for(int i = 0; i < n; i++){
			if(i == n-1){
				stars = stars + "*";
			} else{
				stars = stars + "* ";
			}
		}
		for(int j = 0; j < n; j++){
			if(j % 2 != 0){
				System.out.print(" ");
			}
			System.out.println(stars);
		}
		
		
	}
}
