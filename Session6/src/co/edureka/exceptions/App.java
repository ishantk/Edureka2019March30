package co.edureka.exceptions;

public class App {

	public static void main(String[] args) {
		
		System.out.println(">> App Started");
		
		int[] arr = {10, 20, 30, 40, 50};
		int a=10, b=0, c=0;
		try{
			try{
				c = a/b;
			}catch(ArithmeticException ae){
				System.out.println(">> ArithmeticException "+ae);
			}
			System.out.println(">> arr[30] is: "+arr[30]);
			
		}/*catch(ArrayIndexOutOfBoundsException aRef){
			System.out.println(">> Some Error !! ");
			//System.out.println(">> Some Error !! "+aRef);
			//aRef.printStackTrace(); // this shall show the error along with line number
		}catch(ArithmeticException aRef){
			System.out.println(">> Some Error !! "+aRef);
		}*/
		catch(Exception e){
			System.out.println(">> Some Error !! "+e);
		}finally{
			System.out.println(">> Important Statement"); // shall be executed either exception occurs or not
		}
		
		System.out.println(">> c is: "+c);
		
		System.out.println(">> App Finished");

	}

}

// error -> at run time -> exception
// when exception will come it shall terminate the application abnormally
// Our App will crash.


/*
 	try{
 	
 	}catch(){
 	
 	}
 	
 	try{
 	
 	}finally{
 	
 	}
 	
 	try{
 	
 	}catch(){
 	
 	}finally{
 	
 	}
 	
 	try{
	 	try{
	 	
	 	}catch(){
	 	
	 	}finally{
	 	
	 	}
 	}catch(){
	 	try{
	 	
	 	}catch(){
	 	
	 	}finally{
	 	
	 	}
 	}finally{
	 	try{
	 	
	 	}catch(){
	 	
	 	}finally{
	 	
	 	}
 	}
 	
*/ 	
