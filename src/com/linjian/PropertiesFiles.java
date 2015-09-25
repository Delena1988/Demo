package com.linjian;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class PropertiesFiles {
	/**
	 * 从配置文件ipConfig.properties中读取配置信息
	 */
	public void getFromPropertiesFile() {
		InputStream inputStream = this.getClass().getClassLoader()
				.getResourceAsStream("com/linjian/ipConfig.properties");
		Properties p = new Properties();
		try {
			p.load(inputStream);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("ip:" + p.getProperty("ip") + ",port:"
				+ p.getProperty("port"));
	}

	// 读取xml配置文件并根据组织机构代码organCode取得同层addr节点内容
	/**
	 * 
	 * @param organCode组织机构代码
	 * @return IP＋端口 医院前置机
	 * @throws DocumentException
	 */
	public String getFromXML(String organCode) throws DocumentException {
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File("src/com/linjian/conf.xml"));
		Node node = document.selectSingleNode("//hospital[organCode = \'"
				+ organCode + "\']");
		Node addrNode = node.selectSingleNode("//addr");
		System.out.println(addrNode.getText());
		return node.getText();
	}

	public static void main(String[] args) throws DocumentException {
		PropertiesFiles files = new PropertiesFiles();
		files.getFromPropertiesFile();
		files.getFromXML("144010000128");

	}

}
