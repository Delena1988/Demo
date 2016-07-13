package com.linjian;

import java.util.ArrayList;
import java.util.List;

public class ListContains {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		list.add("aaa");
//		if (!list.contains("aaa")) {
//			list.add("aaa");
//			System.out.println("1");
//		}
//		if (!list.contains("bbb")) {
//			list.add("bbb");
//			System.out.println("2");
//		}
//		if (!list.contains("bbb")) {
//			list.add("bbb");
//			System.out.println("3");
//		}
//		if (!list.contains("ccc")) {
//			list.add("ccc");
//			System.out.println("4");
//		}
//		System.out.println(list.toString());
		
		List<String> list = new ArrayList<String>();
		list.add("111");
		list.add("222");
		list.add("333");
		
		System.out.println(list.indexOf("222"));
		System.out.println(list.contains("111"));
		System.out.println(list.contains("222"));
		System.out.println(list.contains("333"));
	}
}
