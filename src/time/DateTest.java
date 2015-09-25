package time;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS");
		Date date1 = new Date();
		System.out.println(sdf.format(date1));
		System.out.println(date1.getTime());
//		System.out.println(date1.toString());
		for (int i = 0; i <= 10000; i++) {
			i = i + 1;
		}
		Date date2 = new Date();
		System.out.println(sdf.format(date2));
		System.out.println(date2.getTime());
		
//		Date dt = new Date(System.currentTimeMillis());
		Date dt = new Date(Long.parseLong("1442471339752"));
		System.out.println(sdf.format(dt));
	}
}
