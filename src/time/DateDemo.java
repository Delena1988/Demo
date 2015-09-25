package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ʼ�� Date ����
		Date date = new Date();

		// ʹ�� toString() ������ʾ����ʱ��
		System.out.println(date.toString());

		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat(
				"E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		System.out.println("Current Date: " + ft.format(dNow));

		Calendar c1 = Calendar.getInstance();
		c1.set(2009,6,12);
		System.out.println(c1.get(Calendar.MONTH));
		// diff();
	}

	// ����ʱ�������Ժ���Ϊ��λ��
	public static void diff() {
		try {
			long start = System.currentTimeMillis();
			System.out.println(new Date() + "\n");
			Thread.sleep(5 * 60 * 10);
			long end = System.currentTimeMillis();
			System.out.println(new Date() + "\n");
			long diff = end - start;
			System.out.println("Difference is : " + diff);
		} catch (Exception e) {
			System.out.println("Got an exception!");
		}
	}

}
