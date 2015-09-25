package time;

class MyClass{
}

public class RefactoringDemo {
	
	private String str;
	public static final class MyThread implements Runnable {
		@Override
		public void run() {
			// TODO Auto-generated method stub

		}
	}

	public static final int NUM = 10;
	private RefactoringDemoData data = new RefactoringDemoData();
	private static String tel = "110";

	public static int test(MyUser myUser) {
		System.out.println("hello");
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RefactoringDemo refactoringDemo = new RefactoringDemo();
		System.out.println(refactoringDemo.data.name);
		test(new MyUser(0));

		test1();

		new Thread(new MyThread()).start();
	}

	public static void test1() {
		for (int i = 0; i < NUM; i++) {
			System.out.println(i);
		}
	}
}
