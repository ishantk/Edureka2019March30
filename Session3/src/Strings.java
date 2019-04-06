
public class Strings {

	public static void main(String[] args) {
		
		// String is a built in Class
		// int is not a Class
		
		// 1. Interned Way
		String s1 = "Hello"; // "Hello" is String Literal or a Constant which gets created in Constant Pool
		String s2 = "HelLO";
		
		// 2. Object Way
		String s3 = new String("Hello");
		String s4 = new String("HelLO");
		
		// s1, s2, s3 and s4 are Reference Variables and contains HashCodes for Strings
		
		// if we display the above reference variables, we shall not see HashCodes rather we shall be seeing the data
		System.out.println("s1 is: "+s1);
		System.out.println("s2 is: "+s2);
		System.out.println("s3 is: "+s3);
		System.out.println("s4 is: "+s4);
		
		// toString is executed automatically when we print reference variables
		System.out.println("s1.toString() is: "+s1.toString());
		System.out.println("s2.toString() is: "+s2.toString());
		System.out.println("s3.toString() is: "+s3.toString());
		System.out.println("s4.toString() is: "+s4.toString());
		
		// Comparing Reference variables for HashCodes
		if(s1 == s2){
			System.out.println("s1 == s2");
		}else{
			System.out.println("s1 != s2");
		}
		
		if(s3 == s4){
			System.out.println("s3 == s4");
		}else{
			System.out.println("s3 != s4");
		}
		
		if(s1 == s3){
			System.out.println("s1 == s3");
		}else{
			System.out.println("s1 != s3");
		}
		
		// Compare Strings for Data/Value
		if(s1.equals(s2)){
			System.out.println("s1 equals s2");
		}else{
			System.out.println("s1 not equals s2");
		}
		
		if(s3.equals(s4)){
			System.out.println("s3 equals s4");
		}else{
			System.out.println("s3 not equals s4");
		}
		
		if(s1.equals(s3)){
			System.out.println("s1 equals s3");
		}else{
			System.out.println("s1 not equals s3");
		}
		
		if(s1.compareTo(s2) == 0){
			System.out.println("s1 compare To s2");
		}else{
			System.out.println("s1 not compare To s2");
		}
		
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("s1 equals s2 with Ignore Case");
		}else{
			System.out.println("s1 not equals s2 with Ignore Case");
		}
		
		if(s1.compareToIgnoreCase(s2) == 0){
			System.out.println("s1 compare To s2 with Ignore Case");
		}else{
			System.out.println("s1 not compare To s2 with Ignore Case");
		}
		
		if(s1.toString() == s3.toString()){
			System.out.println("s1 == s2");
		}else{
			System.out.println("s1 != s2");
		}
		
		
	}

}
