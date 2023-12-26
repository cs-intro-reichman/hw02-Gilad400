
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		String children = "";
		int sum = 0;
		while((children.indexOf('g') == -1) || (children.indexOf('b') == -1)){
			if(Math.random() < 0.5){
				children = children + "g ";
			} else {
				children = children + "b ";
			}
		sum++;
		}
		System.out.println(children);
		System.out.println("You made it... and you now have " + sum + " children.");
	}
}
