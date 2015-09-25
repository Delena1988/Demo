package com.linjian;

import java.io.IOException;
import java.net.InetAddress;

public class IPDemo {
	public static void main(String[] args) throws IOException {
		// 获取本机地址
		InetAddress i = InetAddress.getLocalHost();
		System.out.println(i.toString());
		System.out.println("address:" + i.getHostAddress());
		System.out.println("name:" + i.getHostName());
		System.out.println();

		// 在给定主机名的情况下确定主机的 IP 地址
		InetAddress ia = InetAddress.getByName("www.baidu.com");
		System.out.println("address:" + ia.getHostAddress());
		System.out.println("name:" + ia.getHostName());
	}
}
