package com.linjian;

public class Init {
	public static void main(String[] args) {
		A a = new A();
		System.out.println("i:"+a.i);
		System.out.println("j:"+a.j);
	}
}

class A {
	static int i;

	static {
		// System.out.println(i);
		// System.out.println(j); can't use a field before it is defined
		// i=j; even you can't use it to initialize other fields
		j = i; // but, can be initialized.
	}

	static int j;
}