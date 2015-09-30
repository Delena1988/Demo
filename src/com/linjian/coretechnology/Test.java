package com.linjian.coretechnology;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.LocalAttribute;

public class Test {
	public static void main(String[] args) throws IOException {
		int a = 1_1_1_1;
		System.out.println("a:" + a);
		System.out.println("a is not a number:" + Double.isNaN(a));

		Double b = 123.12;
		System.out.println("b:" + b);
		System.out.println("b is not a number:" + Double.isNaN(b));

		char c = '\u2122';
		System.out.println("c" + c);

		Double b1 = Math.sqrt(b);
		System.out.println("b's sqrt:" + b1);

		Scanner in = new Scanner(Paths.get("//Users/linjian/Desktop/1"));
		System.out.println(in);

		out: for (int i = 0; i < 10; i++) {
			System.out.println("i:" + i + "\t");
			for (int j = 0; j < 10; j++) {
				System.out.print("j:" + j + "\t");
				if (j == 5)
					break out;
			}
		}

		System.out.println();
		Locale.setDefault(Locale.ITALY);
		System.out.println(Calendar.DAY_OF_WEEK);
		
		GregorianCalendar d = new GregorianCalendar();
		int dayOfMonth = d.get(Calendar.DAY_OF_MONTH);
		System.out.println(dayOfMonth);
	}
}
