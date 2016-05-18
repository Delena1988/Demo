package com.linjian;

import java.util.Arrays;
import java.util.List;


public class ListDemo {
	public static void main(String[] args) {
//		String str = "a,b,c";
//		String[] strs = str.split(",");
//		List list = Arrays.asList(strs);
//		System.out.println(list.size());
		int[] data =  {1,2,3,4,5}; 
		List list = Arrays.asList(data); 
		System.out.println("列表中的元素数量是：" + list.size()); 
	}
}
