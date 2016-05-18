package com.linjian.baseknowledge;

import java.math.BigDecimal;

public class DoubleDemo {
	public static void main(String[] args) {
		Double a = new Double(1.1);
		Double b = new Double(2.2);
		
		BigDecimal bd1 = new BigDecimal("0.0"+"");
		BigDecimal bd2 = new BigDecimal("2.2");
		System.out.println("Double add:"+(a+b));
		System.out.println("BigDecimal add:"+bd1.add(bd2).doubleValue());
	}
}
