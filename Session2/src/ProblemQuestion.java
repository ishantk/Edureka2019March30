
public class ProblemQuestion {

	public static void main(String[] args) {
		
		// Lets Store Data in Single Value Containers as learnt till now:
		
		// Democratic Party
		int dpVoteCountArizona = 126;
		int dpVoteCountFlorida = 32;
		int dpVoteCountVermont = 230;
		int dpVoteCountTexas = 21;
		int dpVoteCountGeorgia = 200;
		
		// Republican Party
		int rpVoteCountArizona = 152;
		int rpVoteCountFlorida = 85;
		int rpVoteCountVermont = 121;
		int rpVoteCountTexas = 215;
		int rpVoteCountGeorgia = 300;
		
		// Find who won ?
		int dpVotes = dpVoteCountArizona + dpVoteCountFlorida + dpVoteCountVermont + dpVoteCountTexas + dpVoteCountGeorgia;
		int rpVotes = rpVoteCountArizona + rpVoteCountFlorida + rpVoteCountVermont + rpVoteCountTexas + rpVoteCountGeorgia;
		
		System.out.println("Democratic Votes: "+dpVotes);
		System.out.println("Republican Votes: "+rpVotes);
		
		if(dpVotes > rpVotes){
			System.out.println("Democratic Party won by "+(dpVotes-rpVotes)+" votes");
		}else{
			System.out.println("Republican Party won by "+(rpVotes-dpVotes)+" votes");
		}
			
		// Problem is Solved -> for 5 regions
		// What can be the Challenge ?
		// When regions will increase our development effort to store data in Single Value Container will increase
		// Performing Arithmetic Operation will also be a challenge
		// eg: 500 regions
		
		System.out.println();
		
		// Lets address the Challenge with Arrays
		int[] dpVoteCounts = {126, 32, 230, 21, 200};
		int[] rpVoteCounts = {152, 85, 121, 215, 300};
		
		// HW: use 2-D Array to solve this Problem
		int[][] votes = {
							{126, 32, 230, 21, 200},	// 0 -> Democratic
							{152, 85, 121, 215, 300}	// 1 -> Republican
						};
		
		dpVotes = 0;
		for(int elm : dpVoteCounts){
			dpVotes = dpVotes + elm;
		}
		
		rpVotes = 0;
		for(int elm : rpVoteCounts){
			rpVotes = rpVotes + elm;
		}
		
		if(dpVotes > rpVotes){
			System.out.println("Democratic Party won by "+(dpVotes-rpVotes)+" votes");
		}else{
			System.out.println("Republican Party won by "+(rpVotes-dpVotes)+" votes");
		}
		
		// Results in an Error at Run Time -> Exception (Cover in Future)
		//System.out.println("dpVoteCounts[10] is: "+dpVoteCounts[10]);
	}

}
