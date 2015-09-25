package com.linjian.json;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

public class Test {

	public static void main(String[] args) {
		User user = new User();
		user.setName("linjian");
		user.setAge(28);
		user.setSex("male");
		
		JSONObject jsonObject = JSONObject.fromObject(user);
		System.out.println("User: " + jsonObject);
		
		//设置jsonconfig实例，对包含和需要排除的属性进行添加或删除
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setExcludes(new String[]{"sex"});
		JSONObject jsonObject2 = JSONObject.fromObject(user,jsonConfig);
		System.out.println("User: " + jsonObject2);
		
		//过滤age，Person实现JSONString
		Person person = new Person();
		person.setName("linjian");
		person.setAge(28);
		person.setSex("male");
		JSONObject jsonObject3 = JSONObject.fromObject(person);
		System.out.println("Person: " + jsonObject3);
		
	}

}
