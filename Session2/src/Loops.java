
public class Loops {

	public static void main(String[] args) {
		
		/*
		int number = 5;
		int i = 1;
		
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++; // increment i by 1 so new value is now 2
		
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++;
		
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++;
		
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++;
		
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++;
		
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++;
		
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++;
		
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++;
		
		System.out.println(number+" "+i+"'s are "+(number*i));
		i++;
		
		System.out.println(number+" "+i+"'s are "+(number*i));
		
		// Challenge : We as programmer are writing the code which is same, again and again
		*/
		

		int number = 5;
		int i = 111;
		
		while(i <= 10){ // condition checking is in the beginning 
			System.out.println(number+" "+i+"'s are "+(number*i));
			i++;
		}
		
		System.out.println("================");
		
		number = 7;
		i = 111;
		
		do{
			System.out.println(number+" "+i+"'s are "+(number*i));
			i++;
		}while(i <= 10); // condition checking is in the end
		
		System.out.println("================");
		
		// we can create storage containers in the loop itself.
		// storage containers shall be destroyed once loop is finished
		for(int num=9, j=1; j<=10; j++){
			System.out.println(num+" "+j+"'s are "+(num*j));
		}
		
	}

}
