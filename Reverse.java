/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String str = args[0];
		String reverseString = "";
		int i = str.length() -1;
		while(i >= 0){
			reverseString = reverseString + str.charAt(i);
			i--;
		}
		System.out.println(reverseString);
		System.out.println("The middle character is " + reverseString.charAt(reverseString.length() / 2));
	}
}
