package com.linjian;

public class OddOrNot {
	public static void main(String[] args) {
		for (int i = -4; i < 4; i++) {
//			System.out.println(oddOrNot(i));
			System.out.println(oddOrNotNew(i));
		}
		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());
	}
	
	public static boolean oddOrNot(int num) {
	    return num % 2 == 1;
	}
	
	public static boolean oddOrNotNew(int num) {
	    return (num & 1) != 0;
	}
}
