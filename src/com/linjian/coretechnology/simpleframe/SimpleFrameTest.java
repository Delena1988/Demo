package com.linjian.coretechnology.simpleframe;

import javax.swing.JFrame;

public class SimpleFrameTest {
	public static void main(String[] args) {
		SimpleFrame frame = new SimpleFrame();
		frame.setTitle("FrameTest");	//标题
		frame.setResizable(false);		//是否允许用户改变框架大小
		frame.setLocation(500, 300);	//窗口位置
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class SimpleFrame extends JFrame{
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	
	public SimpleFrame(){
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}
