package time;

/*
 �����ַ��������޸ĵ�ʱ����Ҫʹ��StringBuffer��StringBuilder�ࡣ
 ��String�಻ͬ���ǣ�StringBuffer��StringBuilder��Ķ����ܹ�����ε��޸ģ����Ҳ������µ�δʹ�ö���
 StringBuilder����Java 5�б����������StringBuffer֮������ͬ����StringBuilder�ķ��������̰߳�ȫ�ģ�����ͬ�����ʣ���
 ����StringBuilder�����StringBuffer���ٶ����ƣ����Զ�������½���ʹ��StringBuilder�ࡣȻ����Ӧ�ó���Ҫ���̰߳�ȫ������£������ʹ��StringBuffer�ࡣ
 */
public class StringBufferTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sBuffer = new StringBuffer(" test");
		sBuffer.append(" String Buffer");
		System.out.println(sBuffer);
		System.out.println(sBuffer.reverse());
	}

}
