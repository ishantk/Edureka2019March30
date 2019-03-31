
public class NestedLoops {

	public static void main(String[] args) {
		
		// Outer Loop
		for(int i=1;i<=3;i++){
			
			System.out.println("i is: "+i);
			
			// Inner Loop
			for(int j=1;j<=i;j++){
				//System.out.println("j is: "+j);
				System.out.print(j+"  ");
			}
			System.out.println();
			System.out.println("----------");
		}
		
	}

}
