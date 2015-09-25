package com.linjian.baseknowledge;

import java.util.Scanner;

import sun.management.OperatingSystemImpl;


public class ScannerDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		
		System.out.println("What's your name?");
		String name = in.nextLine();
		
		System.out.println("How old are you?");
		int age = in.nextInt();
		
		System.out.println("Hello " + name + ".Next year you'll be " + (age + 1));
		
		System.out.println(Runtime.getRuntime().maxMemory());
		System.out.println(Runtime.getRuntime().freeMemory());
		
	}
}
