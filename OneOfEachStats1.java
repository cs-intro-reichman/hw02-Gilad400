/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		
		String children = "";
		double totalSum = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		String mostCommon = "";
		for(int i = 0; i < T; i++){
			int sumTemp = 0;
			while((children.indexOf('g') == -1) || (children.indexOf('b') == -1)){
				if(Math.random() < 0.5){
					children = children + "g ";
				} else {
					children = children + "b ";
				}
				sumTemp++;
				totalSum++;
			}
			if(sumTemp == 2){
				two++;
				if(two > three && two > four){
					mostCommon = "The most common number of children is 2.";
				}
			} 
			if(sumTemp == 3){
				three++;
				if(three > two && three > four){
					mostCommon = "The most common number of children is 3.";
				}
			} 
			if(sumTemp >= 4){
				four++;
				if(four > three && four > two){
					mostCommon = "The most common number of children is 4 or more.";
				}
			}
			sumTemp = 0;
			children = "";
		}
		double average = (totalSum / T);
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + two);
		System.out.println("Number of families with 3 children: " + three);
		System.out.println("Number of families with 4 or more children: " + four);
		System.out.println(mostCommon);
	}
}
