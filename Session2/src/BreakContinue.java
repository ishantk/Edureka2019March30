
public class BreakContinue {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++){
			
			System.out.println("i is: "+i);
			
			if(i==5){
				break; // breaking the loop shall terminate the loop
			}
		}
		
		System.out.println("*********");
		
		for(int i=1;i<=10;i++){
			
			if(i<=5){
				continue; // will take the loop into next iteration and skip the statements below
			}
			
			System.out.println("i is: "+i);
		}

	}

}
