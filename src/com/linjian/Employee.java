package com.linjian;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Cloneable {
	private String name;
	private double salary;
	private Date hireDate;
	
	public Employee(String n,double s){
		this.name = n;
		this.salary = s;
		hireDate = new Date();
	}

	@Override
	protected Employee clone() throws CloneNotSupportedException {
		//call Object.clone()
		Employee cloned = (Employee) super.clone();
		//clone mutable fields
		cloned.hireDate = (Date) hireDate.clone();
		return cloned;
	}
	
	public void setHireDate(int year,int month,int day){
		Date newHireDate = new GregorianCalendar(year, month - 1, day).getTime();
		hireDate.setTime(newHireDate.getTime());;
	}
	
	public void raiseSalary(double byPercent){
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public String toString(){
		return "Employee[name=" + name + ",salary=" + salary + ",hireDate=" + hireDate + "]";
	}
}
