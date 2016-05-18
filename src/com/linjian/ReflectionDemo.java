package com.linjian;

import java.lang.reflect.Modifier;


//static Class forName(String className) 返回描述类名为className的Class对象
//Object newInstance 返回这个类的一个新实例
public class ReflectionDemo {
	public static void main(String[] args) {
		String s = "aaa";
		Class c = s.getClass();
		System.out.println(c.toString());

		String s1 = "java.util.Date";
		try {
			Object o = Class.forName(s1).newInstance();
			System.out.println(o.toString());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(c.getModifiers());
		System.out.println(Modifier.isPublic(c.getModifiers()));
		System.out.println(Modifier.isFinal(c.getModifiers()));
		System.out.println(Modifier.toString(c.getModifiers()));
		System.out.println(Modifier.FINAL);
		System.out.println(Modifier.PUBLIC);
	}
}
