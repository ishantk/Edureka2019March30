
public class StringBuiltInMethods {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE
		// It cannot be changed
		// Manipulation on String shall generate a new String in the memory
		String s1 = "John, Jennie, Jim, Jack, Joe";
		System.out.println("s1 is: "+s1);
		
		// toUpperCase shall return a new modified String
		String s2 = s1.toUpperCase();
		System.out.println("s1 now is: "+s1);
		
		System.out.println("s2 is: "+s2);
		
		int len = s1.length();
		System.out.println("Length of s1 is: "+len);
		
		char ch = s1.charAt(0);
		System.out.println("ch is: "+ch);
		
		ch = s1.charAt(len-1);
		System.out.println("ch now is: "+ch);
		
		String s3 = s1.substring(3);
		System.out.println("s3 is: "+s3);
		
		//String s4 = s1.substring(0, 4);
		String s4 = s1.substring(5, 9);
		System.out.println("s4 is: "+s4);
		
		// Convert String into Array of Characters
		char[] chArr = s1.toCharArray();
		for(char c : chArr){
			System.out.print(c+" ");
		}
		System.out.println();
		
		// s1 shall be splitted on the basis of ,
		String[] names = s1.split(",");
		for(String n : names){
			System.out.println(n.trim());
		}

		int idx = s1.indexOf('o');
		System.out.println("idx is: "+idx);
		
		idx = s1.lastIndexOf('o');
		System.out.println("last idx is: "+idx);
		
		idx = s1.indexOf("Jennie");
		System.out.println("index of Jennie is: "+idx);
		
		String email = "john@example.com";
		if(email.contains("@") && email.contains(".")){
			System.out.println(email+" is valid");
		}else{
			System.out.println(email+" is invalid");
		}
		
		String fileName = "hello.mp3";
		if(fileName.endsWith(".mp3")){
			System.out.println(fileName+" can be played");
		}else{
			System.out.println("Invalif file to be played");
		}
		
		String s5 = s1.replace('J', 'K');
		System.out.println("s1 is: "+s1);
		System.out.println("s5 is: "+s5);
		
	}
	
	// Oracle String Documentation : https://docs.oracle.com/javase/8/docs/api/java/lang/String.html

}
