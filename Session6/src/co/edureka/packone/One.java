package co.edureka.packone;

// public 
public class One {

	private void pvtShow(){
		System.out.println(">> This is private show of One");
	}
	
	void defShow(){
		System.out.println(">> This is default show of One");
	}
	
	protected void protShow(){
		System.out.println(">> This is protected show of One");
	}
	
	public void pubShow(){
		System.out.println(">> This is public show of One");
	}
	
}

// default
class Two{
	
	private void pvtShow(){
		System.out.println(">> This is private show of Two");
	}
	
	void defShow(){
		System.out.println(">> This is default show of Two");
	}
	
	protected void protShow(){
		System.out.println(">> This is protected show of Two");
	}
	
	public void pubShow(){
		System.out.println(">> This is public show of Two");
	}
	
}

/*
// private not allowed
private class Three{
	
}

//protected not allowed
protected class Four{
	
}
*/

// if we create a class which is public it is mandatory to save the file with same name i.e. Five.java
/*public class Five{
	
}*/

// So we can have n-number of default classes
/*class Six{
	
}*/

