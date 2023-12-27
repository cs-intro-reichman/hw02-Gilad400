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
		//A loop in which we generate the test T times.
		for(int i = 0; i < T; i++){
			int sumTemp = 0;
			//A loop in which we genarate children until we have at least one of each
			while((children.indexOf('g') == -1) || (children.indexOf('b') == -1)){
				if(Math.random() < 0.5){
					children = children + "g ";
				} else {
					children = children + "b ";
				}
				sumTemp++;
				totalSum++;
			}
			//Add the result to a track variables and checks what is the most common number of children  
			if(sumTemp == 2){
				two++;
				if(two > three && two > four){
					mostCommon = "The most common number of children is 2.";
				}
			} else if(sumTemp == 3){
				three++;
				if(three > two && three > four){
					mostCommon = "The most common number of children is 3.";
				}
			} else if(sumTemp >= 4){
				four++;
				if(four > three && four > two){
					mostCommon = "The most common number of children is 4 or more.";
				}
			}
			children = "";
		}
		//Calculate the average
		double average = (totalSum / T);
		//Print the results
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + two);
		System.out.println("Number of families with 3 children: " + three);
		System.out.println("Number of families with 4 or more children: " + four);
		System.out.println(mostCommon);
	}
}
