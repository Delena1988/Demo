package com.linjian;

public class CloneTest {
	public static void main(String[] args) {
		try {
			Employee original = new Employee("John Q. Public", 50000);
			original.setHireDate(2000, 1, 1);
			Employee copy;
			copy = original.clone();
			copy.raiseSalary(10);
			System.out.println(original.toString());
			System.out.println(copy.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
