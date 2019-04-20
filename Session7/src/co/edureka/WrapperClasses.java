package co.edureka;

public class WrapperClasses {

	public static void main(String[] args) {
		
		
		// Primitives: Single value Container
		// They cannot be passed/used as reference as they are value type !!
		int i = 10;
		char ch = 'A';
		double pi = 3.14; 
		
		// We can represent primitives as references
		// BOXING -> Convert Primitive into Object / Reference Type
		Integer iRef = new Integer(i);			// BOXING
		Character chRef = new Character(ch);	// BOXING
		Double piRef = new Double(pi);			// BOXING
		
		Integer iRef1 = i;						// AUTO-BOXING
		// Integer iRef1 = i; shall be converted to Integer iRef1 = new Integer(i);
		Character chRef1 = ch;					// AUTO-BOXING
		Double piRef1 = pi;						// AUTO-BOXING
			
		// UNBOXING -> Extract Primitive data from Object/Reference Type
		int i1 = iRef.intValue();				// UNBOXING
		char ch1 = chRef.charValue();			// UNBOXING
		double pi1 = piRef.doubleValue();		// UNBOXING
		
		int i2 = iRef;							// AUTO-UNBOXING
		// int i2 = iRef; shall be converted to int i2 = iRef.intValue();		
		char ch2 = chRef;						// AUTO-UNBOXING
		double pi2 = piRef;						// AUTO-UNBOXING
		
		System.out.println(iRef.valueOf(i1));	// UNBOXING
		String str = "110";
		int iVar = Integer.parseInt(str); 		// Converting String to Integer
		System.out.println("iVar is: "+iVar);
		
		
		
	}

}
