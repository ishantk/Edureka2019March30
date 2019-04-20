package co.edureka;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAPI {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(">> Today is: "+date);
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		String date1 = format1.format(date);
		
		SimpleDateFormat format2 = new SimpleDateFormat("hh:mm:ss");
		String time = format2.format(date);
		
		System.out.println(">> Today's Date is: "+date1);
		System.out.println(">> Today's Time is: "+time);
				
		// Calendar : Explore !!		
		

	}

}
