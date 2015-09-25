package com.linjian;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet {

	public static void main(String[] args) throws UnknownHostException {
		//获取本机地址
		InetAddress i = InetAddress.getLocalHost();
		System.out.println(i.toString());
		System.out.println("address:" + i.getHostAddress());
		System.out.println("name:" + i.getHostName());
		System.out.println();
	}

}
