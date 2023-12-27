package DAY13;

import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		int year =cal.get(Calendar.YEAR);
		
		System.out.println(year + "년");
		
		int month = cal.get(Calendar.MONTH)+1;
		System.out.println(month + "월");
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(day + "일");
		
		System.out.println("오늘은" + year + "년" + month + "월" + day + "일" + "입니다.");
		
		
	}

}
