package com.linjian;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inet {

	public static void main(String[] args) throws UnknownHostException {
		//获取本机地址
		InetAddress i = InetAddress.getLocalHost();
		System.out.println(i.toString());
		System.out.println("address:" + i.getHostAddress());
		System.out.println("name:" + i.getHostName());
		System.out.println();
		
		String money = "0";
		DecimalFormat df= new DecimalFormat("######0.00");   
		Double a = Double.parseDouble("58.06")+Double.parseDouble("470.60");
		
//		Double a = Double.parseDouble("470.60");
		System.out.println(String.valueOf(df.format(a)));
		
		List list = new ArrayList();
		Iterator iterator = list.iterator();
		System.out.println(iterator.hasNext());
		System.out.println(list.size());
	}

}
