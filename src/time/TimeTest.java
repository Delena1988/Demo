package time;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Date(System.currentTimeMillis()));
		
		//method 1 
		Calendar nowtime = new GregorianCalendar(); 
		String strDateTime="["+String.format("%04d", nowtime.get(Calendar.YEAR))+"/"+ 
		String.format("%02d", nowtime.get(Calendar.MONTH))+"/" + 
		String.format("%02d", nowtime.get(Calendar.DATE))+" " + 
		String.format("%02d", nowtime.get(Calendar.HOUR))+":" + 
		String.format("%02d", nowtime.get(Calendar.MINUTE))+":" + 
		String.format("%02d", nowtime.get(Calendar.SECOND))+"." + 
		String.format("%03d", nowtime.get(Calendar.MILLISECOND))+"]"; 
		System.out.println(strDateTime); 

		//method 2 
		String msg=""; 
		Date date = new Date(); 
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss.SSS"); 
		msg+="["+sdf.format(date)+"]"; 
		System.out.println(msg); 
		
		//method 3
		Timestamp st = new Timestamp(System.currentTimeMillis());
//		System.out.println("["+st.toString()+"]");
		System.out.println("["+sdf.format(st)+"]");
	}

}
