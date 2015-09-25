package time;

import java.io.*;

public class FileOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PrintStreamDemo();
		Integer i;
		i = 23;
		System.out.println(i.intValue());
		System.out.println(i.byteValue());
		System.out.println(i.getClass());
		System.out.println(i.toBinaryString(i));
		System.out.println(i.toHexString(i));

		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(helloArray);
		System.out.println(helloString);
		
		String str1 = "Hello ";
		String str2 = "World!";
		System.out.println(str1.concat(str2));
		
//		PrintStreamDemo();

	}

	public static void PrintStreamDemo() {
		try {
			FileOutputStream out = new FileOutputStream(
					"C:/Users/Administrator/Desktop/FileOut.txt");
			PrintStream p = new PrintStream(out);
			for (int i = 0; i < 10; i++)
				p.println("This is " + i + " line");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
