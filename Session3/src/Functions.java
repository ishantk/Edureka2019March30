
public class Functions {
	
	// Function or Method
	// addNumbers : Name of Method
	// int a and int b are property of Method and are inputs/arguments to method
	// void is return type/acknowledgement which means no returning/ack
	
	// non static method : we do not put static in front
	void add2Numbers(int a, int b){
		int c = a + b;
		System.out.println(a+" and "+b+" adds up to "+c);
	}
	
	// Once the Method is created it cannot be recreated with same signature | add2Numbers(int x, int x)
	/*void add2Numbers(int x, int x){
		int z = x+y;
		System.out.println(x+" and "+y+" adds up to "+z);
	}*/
	
	// non static method : we do not put static in front
	void add3Numbers(int a, int b, int c){
		int d = a + b + c;
		System.out.println(a+" and "+b+" and "+c+" adds up to "+d);
	}
	
	
	// static method : we put static in front
	static void add2NumbersAgain(int a, int b){
		int c = a+b;
		System.out.println(a+" and "+b+" adds up to "+c);
	}
	
	// return type specified as double, so must return some double at the end
	double areaOfCircle(double radius){
		double area = 3.14 * radius * radius;
		return area; // return shall come up as last statement and when we have specified it
	}
	

	// Whatever we write in main
	// is executed in a sequence
	public static void main(String[] args) {
		/*
		int num1 = 10;
		int num2 = 20;
		int num3 = num1 + num2;
		System.out.println(num1+" and "+num2+" adds up to "+num3);
		
		System.out.println();
		
		// we have another requirement to add some other numbers
		num1 = 11;
		num2 = 33;
		num3 = num1 + num2;
		System.out.println(num1+" and "+num2+" adds up to "+num3);
		
		System.out.println();
		
		// we have another requirement to add some other numbers but now we have 3 numbers
		num1 = 11;
		num2 = 22;
		num3 = 33;
		int num4 = num1 + num2 + num3;
		System.out.println(num1+" and "+num2+" and "+num3+" adds up to "+num4);
		*/
		// Challenge : We have to write same statements again and again
		// Solution  : Create a Function/Method instead and execute it again and again
		
		// Lets create Object of Class Functions
		Functions fRef = new Functions(); // Object Construction Statement | A detailed discussion is pending in future

		// Execution of Non Static Methods:
		fRef.add2Numbers(10, 20);
		fRef.add2Numbers(11, 33);
		fRef.add3Numbers(11, 22, 33);
		// To execute non static methods we need objects
	
		// Execution of static Methods:
		Functions.add2NumbersAgain(12, 13);
		// To execute static methods we need Class Name
		
		double result = fRef.areaOfCircle(2.2);
		System.out.println("Area of Circle with radius 2.2 is: "+result);
		System.out.println("Area of Circle with radius 2.2 is: "+fRef.areaOfCircle(2.2));
		
		// We are post processing the result given by Method
		if(result > 2){
			System.out.println("We shall find the diameter");
		}else{
			System.out.println("Lets switch to other problem");
		}
	}

}
