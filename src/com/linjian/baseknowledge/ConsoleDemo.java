package com.linjian.baseknowledge;

import java.io.Console;

public class ConsoleDemo {
	public static void main(String[] args) {
		Console console = System.console();
		if(console!=null)
			System.out.println("true");
		else {
			System.out.println("false");
		}
//		String username = console.readLine("aaa");
//		char[] password = console.readPassword();
//		System.out.println("username:" + username);
//		System.out.println("password:" + String.valueOf(password));
	}
}
