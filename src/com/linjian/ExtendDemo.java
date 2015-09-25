package com.linjian;

public class ExtendDemo {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.say();
	}
}

class Parent{
	public void say(){
		System.out.println("Parent say");
	}
}

class Child extends Parent{
	public void say(){
		System.out.println("Child say");
	}
}
