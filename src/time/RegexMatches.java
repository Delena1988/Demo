package time;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ָ��ģʽ���ַ�������
		String line = "This order was placed for QT3000! OK?";
		String pattern = "(.*)(\\d+)(.*)";

		// ���� Pattern ����
		Pattern r = Pattern.compile(pattern);

		// ���ڴ��� matcher ����
		Matcher m = r.matcher(line);
		if (m.find()) {
			System.out.println("Found value: " + m.group(0));
			System.out.println("Found value: " + m.group(1));
			System.out.println("Found value: " + m.group(2));
		} else {
			System.out.println("NO MATCH");
		}
		
		
		String REGEX = "\\bcat\\b";
	    String INPUT ="cat cat cat cattie cat";
	    Pattern p = Pattern.compile(REGEX);
	    Matcher m1 = p.matcher(INPUT); // ��ȡ matcher ����
	    int count = 0;
	    while(m1.find()) {
	         count++;
	         System.out.println("Match number "+count);
	         System.out.println("start(): "+m1.start());
	         System.out.println("end(): "+m1.end());
	      }
	    
	}

}
