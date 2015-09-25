package com.linjian.json;

import net.sf.json.JSONString;

public class Person implements JSONString {
	private String name;
	private int age;
	private String sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toJSONString() {
		return "{\"name\":\"" + name + "\",\"sex\":\"" + sex + "\"}";
	}
}
