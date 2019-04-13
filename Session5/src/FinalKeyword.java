// You cannot create child from it !! cannot be inherited
final class CA{
	// final method cannot be overrided in child
	final void show(){
		System.out.println(">> This is show of CA");
	}
}

class CB{ //extends CA{ -> error
	
	/*void show(){
		System.out.println(">> This is show of CB");
	}*/
}
public class FinalKeyword {

	public static void main(String[] args) {
		
		int i = 10;
		i = 100;
		
		// j is final which cannot be modified. Read Only Container
		final int j = 10;
		//j = 100; error
		
	}

}
