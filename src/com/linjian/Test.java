package com.linjian;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list.size());
		
		String str = "abcdef";
		System.out.println(str.substring(1));
		
		try {
			String referralDate = "2015-03-01";
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf.parse(referralDate);
			Calendar calendar  = Calendar.getInstance();
			calendar.setTime(date);
			calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) - 1);
			String reminderDate = sdf.format(calendar.getTime());
			System.out.println(reminderDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		String a = "2015-11-12 至 2015-12-18";
		String a = "2015-11-12";
		int index = a.indexOf("至");
		if (index < 0) {
			System.out.println(a.trim());
		}else{
			System.out.println(a.substring(0, index).trim());
		}
		
		
		System.out.println(StringAdd(".7",null));
	}
	
	public static String StringAdd(String num1,String num2){
		if(num1 == null||"".equals(num1.trim()))
			num1 = "0.0";
		if(num2 == null||"".equals(num2.trim()))
			num2 = "0.0";
		BigDecimal bd1 = new BigDecimal(num1.trim());
		BigDecimal bd2 = new BigDecimal(num2.trim());
		NumberFormat nf = NumberFormat.getInstance();
		nf.setGroupingUsed(false);
		Double d = bd1.doubleValue();
		return d==0?null:String.valueOf(nf.format(d));
	}
}
