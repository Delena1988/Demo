package com.linjian;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * This program uses reflection to print all feature of a class
 * 
 * @author linjian
 * @date 2016年1月7日下午3:33:06
 *
 */
public class ReflectionTest {
	public static void main(String[] args) {
		//read name from command line args or user input
		String name;
		if (args.length > 0) {
			name = args[0];
		}else {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter class name(e.g. java.util.Date):");
			name = in.next();
		}
		try {
			//print class name and superclass name(if!=Object)
			Class cl = Class.forName(name);
			Class supercl = cl.getSuperclass();
			String modifiers = Modifier.toString(cl.getModifiers());
			if (modifiers.length() > 0) {
				System.out.print(modifiers + " ");
			}
			System.out.print("class " + name);
			if (supercl != null && supercl != Object.class) {
				System.out.print("extends " + supercl.getName());
			}
			
			System.out.println("\n{\n");
			printConstructor(cl);
			System.out.println();
			printMethod(cl);
			System.out.println();
			printFileds(cl);
			System.out.println("}");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void printConstructor(Class cl) {
		Constructor[] constructors = cl.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			String name = constructor.getName();
			System.out.println("   ");
			String modifiers = Modifier.toString(constructor.getModifiers());
			if (modifiers.length() > 0) {
				System.out.print(modifiers + " ");
			}
			System.out.print(name + "(");
			
			//print parameter types
			Class[] parameterTypes = constructor.getParameterTypes();
			for (int i = 0; i < parameterTypes.length; i++) {
				if (i > 0) {
					System.out.print(", ");
				}
				System.out.print(parameterTypes[i].getName());
			}
			System.out.println(");");
		}
	}
	
	/**
	 * print all methods of a class 
	 * @param cl
	 */
	private static void printMethod(Class cl) {
		Method[] methods = cl.getDeclaredMethods();
		for (Method method : methods) {
			Class returnType = method.getReturnType();
			String name = method.getName();
			
			System.out.print("   ");
			//print modifiers,return type and method name
			String modifiers = Modifier.toString(cl.getModifiers());
			if (modifiers.length() > 0) {
				System.out.print(modifiers + " ");
			}
			System.out.print(returnType.getName() + " " + name + "(");
			
			//print parameter types
			Class[] parameterTypes = method.getParameterTypes();
			for (int i = 0; i < parameterTypes.length; i++) {
				if (i > 0) {
					System.out.print(", ");
				}
				System.out.print(parameterTypes[i].getName());
			}
			System.out.println(");");
		}
	}
	
	/**
	 * print all fields of a class
	 * @param cl
	 */
	private static void printFileds(Class cl) {
		Field[] fields = cl.getDeclaredFields();
		for (Field field : fields) {
			Class type = field.getType();
			String name = field.getName();
			System.out.print("   ");
			String modifiers = Modifier.toString(field.getModifiers());
			if (modifiers.length() > 0) {
				System.out.print(" ");
			}
			System.out.println(type.getName() + " " + name + ";" );
		}
	}
}
