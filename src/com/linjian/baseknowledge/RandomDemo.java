package com.linjian.baseknowledge;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		double a = Math.random();
		System.out.println("Math.random function:" + a);
		
		Random random = new Random();
		int b = random.nextInt(100);
		System.out.println("Util Random Class:" + b);
	}
}
