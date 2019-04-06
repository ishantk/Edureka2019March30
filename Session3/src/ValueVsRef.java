
public class ValueVsRef {

	void incrementNumber(int num){
		num = num + 1;
		System.out.println(">> num is: "+num);
	}
	
	void incrementNumbers(int[] numbers){ // numbers is a Reference Variable
		System.out.println("numbers is: "+numbers+" and length is: "+numbers.length);
		
		for(int i=0;i<numbers.length;i++){
			numbers[i] = numbers[i] + 1;
		}
	}
	
	public static void main(String[] args) {
		
		ValueVsRef vRef = new ValueVsRef();
		
		int n = 10;
		vRef.incrementNumber(n); // Executing or Calling the method with value (n contains value which shall be passed to num)
		System.out.println(">> n is: "+n);
		
		// n is property of main where num is property of incrementNumber method
		// we just copy the value of n into num
		// they are different storage containers
		
		
		int[] nums = {10, 20, 30, 40, 50};
		System.out.println("nums is: "+nums+" and length is: "+nums.length);
		
		vRef.incrementNumbers(nums); // Executing or Calling the Method with Reference (nums is a ref variable containing HashCode of Array)
		
		// nums is property of main where numbers is property of incrementNumbers method
		// we just copy the reference of nums into numbers
		// they are different storage containers
		
		for(int elm : nums){
			System.out.print(elm+"  ");
		}

	}

}
