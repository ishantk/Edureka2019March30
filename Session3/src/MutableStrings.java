
public class MutableStrings {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE
		String str = new String("Hello");
		String modifiedStr = str.concat(" World");
		//String modifiedStr = str + " World";
		
		System.out.println("str is: "+str);
		System.out.println("modifiedStr is: "+modifiedStr);
		
		// MUTABLE version of String | THREAD-SAFE
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" World");
		
		System.out.println("buffer is: "+buffer);
		
		// MUTABLE version of String | NOT THREAD-SAFE
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" World");
		System.out.println("builder is: "+builder);

		
	}

}
