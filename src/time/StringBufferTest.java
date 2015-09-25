package time;

/*
 当对字符串进行修改的时候，需要使用StringBuffer和StringBuilder类。
 和String类不同的是，StringBuffer和StringBuilder类的对象能够被多次的修改，并且不产生新的未使用对象。
 StringBuilder类在Java 5中被提出，它和StringBuffer之间的最大不同在于StringBuilder的方法不是线程安全的（不能同步访问）。
 由于StringBuilder相较于StringBuffer有速度优势，所以多数情况下建议使用StringBuilder类。然而在应用程序要求线程安全的情况下，则必须使用StringBuffer类。
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
