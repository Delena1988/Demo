package com.linjian.baseknowledge;

public class CodePoint {
	public static void main(String[] args) {
		String greeting = "Hello";
		int n = greeting.length();
		System.out.println(greeting.length());
		
		int cpCount = greeting.codePointCount(0, greeting.length());
		System.out.println(cpCount);
	}
}
