package com.linjian;


/*
 * 字符串s、t拥有相同的hashcode，因为字符串的hashcode是由内容导出的
 * 而字符缓冲串sb、tb却有着不同的hashcode，是因为在StringBuilder中没有定义hashcode方法，它的hashcode是由Object类的默认hashcode方法导出的对象存储位置
 */
public class HashCodeDemo {
	public static void main(String[] args) {
		String s = "OK";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(s.hashCode() + " " + sb.hashCode());
		String t = new String("OK");
		StringBuilder tb = new StringBuilder(t);
		System.out.println(t.hashCode() + " " + tb.hashCode());
	}
}
