package com.linjian.coretechnology;

import java.text.NumberFormat;
import java.util.Random;

public class NumberFormatDemo {

	public static void main(String[] args) {
		Double d = 0.1;
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		NumberFormat percentFormat = NumberFormat.getPercentInstance();
		System.out.println("currencyFormat:" + currencyFormat.format(d));
		System.out.println("percentFormat:" + percentFormat.format(d));
		
		Random generator = new Random();
		int nextId = generator.nextInt(1000);
		System.out.println("generator:"+generator+"\tnextId:"+nextId);
	}

}
