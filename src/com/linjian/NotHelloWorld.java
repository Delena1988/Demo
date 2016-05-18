package com.linjian;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * 
 * @author linjian
 * @date 2016年1月25日下午2:50:29
 *
 */
public class NotHelloWorld {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				JFrame frame = new NotHelloWordFrame();
				frame.setTitle("NotHelloWorld");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}

}

class NotHelloWordFrame extends JFrame{
	private static final long serialVersionUID = 1L;

	public NotHelloWordFrame(){
		add(new NotHelloWorldComponent());
		pack();
	}
}

class NotHelloWorldComponent extends JComponent{
	private static final long serialVersionUID = 1L;
	
	public static final int MESSAGE_X = 75;
	public static final int MESSAGE_Y = 100;

	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawString("Not a Hello World Program!", MESSAGE_X, MESSAGE_Y);
	}
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
	
}