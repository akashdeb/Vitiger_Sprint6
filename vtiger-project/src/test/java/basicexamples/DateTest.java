package basicexamples;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		
		Date date=new Date();
		String year = date.toString().substring(24);
		
		int m = date.getMonth()+1;
		String month = "0"+m;
				
		int day = date.getDate();
		
		String todaysdate = year+"-"+month+"-"+day;
		
		System.out.println(todaysdate);

	}

}
