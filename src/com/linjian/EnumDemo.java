package com.linjian;

import java.util.Arrays;

public enum EnumDemo {
	SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

	private String abbreviation;

	private EnumDemo(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public static void main(String[] args) {
		//String toString()返回枚举常量名
		System.out.println(EnumDemo.SMALL.toString());

		//int ordinal() 返回enum声明中枚举常量的位置，位置从0开始计数
		System.out.println(EnumDemo.SMALL.ordinal());
		
		//static Enum valueOf(Class enumClass,String name) 返回指定的名字、给定类的枚举常量
		EnumDemo e = Enum.valueOf(EnumDemo.class, "SMALL");
		System.out.println(e.getAbbreviation());

		EnumDemo[] values = EnumDemo.values();
		System.out.println(Arrays.toString(values));
	}
}
