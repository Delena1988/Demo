package com.linjian;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;

public class Dom4jTest {
	public static void main(String[] args) throws DocumentException {
		// getNode();
		testDatabaseNull();
	}

	public static void getNode() throws DocumentException {
		String str = "<root>"
				+ "<interface>"
				+ "<code></code>"
				+ "<method>getCardNoInfo</method>"
				+ "</interface>"
				+ "<param>"
				// + "<VISIT_CARD_NO op=\"=\"></VISIT_CARD_NO>"
				// + "<PAT_NAME op=\"=\">朱小明</PAT_NAME>"
				+ "<ID_NUMBER op=\"=\"></ID_NUMBER>"
				+ "<START_DATE op=\"=\">2015-01-08 12:00:00</START_DATE>"
				+ "<END_DATE op=\"=\">2015-07-10 13:00:00</END_DATE>"
				+ "</param>" + "</root>";

		Document document = DocumentHelper.parseText(str);
		Element root = document.getRootElement();
		Node visitCardNoNode = root.selectSingleNode("//VISIT_CARD_NO");
		if (visitCardNoNode == null) {
			System.out.println("visitCardNoNode is null");
		} else {
			System.out.println("visitCardNoNode is not  null"
					+ visitCardNoNode.getName() + visitCardNoNode.getText());
		}
		String patName = root.selectSingleNode("//PAT_NAME").getText();
		if (patName == null) {
			System.out.println("patName is null");
		} else {
			System.out.println("patName is not null" + patName);
		}
	}

	public static void testDatabaseNull() throws DocumentException {
		String str = "<row>" + "<ORGAN_CODE />"
				+ "<REPORT_NO>95270</REPORT_NO>"
				+ "<TEST_ITEM_CODE>RDW</TEST_ITEM_CODE>"
				+ "<TEST_ITEM_NAME>红细胞分布宽度</TEST_ITEM_NAME>"
				+ "<TEST_RESULT_VALUE>13.2</TEST_RESULT_VALUE>"
				+ "<TEST_RESULT_VALUE_UNIT>%</TEST_RESULT_VALUE_UNIT>"
				+ "<REFERENCE_RANGES>1-15.5</REFERENCE_RANGES>"
				+ "<REFERENCE_UPPER_LIMIT>1</REFERENCE_UPPER_LIMIT>"
				+ "<REFERENCE_LOWER_LIMIT>15.5</REFERENCE_LOWER_LIMIT>"
				+ "<NORMAL_FLAG>1</NORMAL_FLAG>" + "</row>";
		Document document = DocumentHelper.parseText(str);
		Element root = document.getRootElement();

		Node organCodeNode = root.selectSingleNode("//ORGAN_CODE");
		System.out.println(organCodeNode.getName());
	}
}