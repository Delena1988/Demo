package com.linjian;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 14);
		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 0);
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE));
		test1();
		test2();
	}
	
	public static void test1(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date(System.currentTimeMillis()));
		//这个月
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		String thisMonthStartTime = sdf.format(calendar.getTime()) + " 00:00:00";
		System.out.println("thisMonthStartTime:" + thisMonthStartTime);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		String thisMonthEndTime = sdf.format(calendar.getTime()) + " 23:59:59";
		System.out.println("thisMonthEndTime:" + thisMonthEndTime);
		//昨天
		calendar.setTime(new Date(System.currentTimeMillis()));
		String yesterdayStartTime = sdf.format(calendar.getTime()) + " 00:00:00";
		System.out.println("yesterdayStartTime:" + yesterdayStartTime);
		String yesterdayEndTime = sdf.format(calendar.getTime()) + " 23:59:59";
		System.out.println("yesterdayEndTime:" + yesterdayEndTime);
	}
	
	public static void test2(){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
        
        //获取前月的第一天
        Calendar   cal_1=Calendar.getInstance();//获取当前日期 
        cal_1.add(Calendar.MONTH, -1);
        cal_1.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天 
        String firstDay = format.format(cal_1.getTime());
        System.out.println("前月的第一天:"+firstDay);
        //获取前月的最后一天
        Calendar cale = Calendar.getInstance();   
        cale.set(Calendar.DAY_OF_MONTH,0);//设置为1号,当前日期既为本月第一天 
        String lastDay = format.format(cale.getTime());
        System.out.println("前月的最后一天:"+lastDay);
        
        
        //获取当前月第一天：
        Calendar c = Calendar.getInstance();    
        c.add(Calendar.MONTH, 0);
        c.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天 
        String first = format.format(c.getTime());
        System.out.println("当前月第一天:"+first);
        
        //获取当前月最后一天
        Calendar ca = Calendar.getInstance();    
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));  
        String last = format.format(ca.getTime());
        System.out.println("当前月最后一天:"+last);

	}
}
