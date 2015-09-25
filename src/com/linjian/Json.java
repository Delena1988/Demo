package com.linjian;

import java.util.HashMap;
import java.util.Map;


import net.sf.json.JSONArray;

public class Json {

	public static void main(String[] args) {
		//声明一个Hash对象并添加数据
		Map params = new HashMap();
		
		params.put("username", "linjian");
		params.put("password", "123456");
		
		//声明JSONArray对象并输入JSON字符串
		JSONArray array = JSONArray.fromObject(params);
		System.out.println(array.toString());
	}

}
