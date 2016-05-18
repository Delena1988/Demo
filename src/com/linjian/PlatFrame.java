package com.linjian;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * a frame with button panel for changing look-and-feel
 * @author linjian
 * @date 2016年1月27日上午11:19:59
 *
 */
public class PlatFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	private JPanel buttonPanel;
	public PlatFrame(){
		buttonPanel = new JPanel();
		UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
		for (UIManager.LookAndFeelInfo info : infos) {
			makeButton(info.getName(), info.getClassName());
		}
		add(buttonPanel);
		pack();
	}
	
	/**
	 * make a button to change the puggable look-and-feel
	 * @param name	the button name
	 * @param platName	the name of look-and-feel class
	 */
	void makeButton(String name,final String platName){
		//add button to panel
		JButton button = new JButton(name);
		buttonPanel.add(button);
		//set button action
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//button action:switch to the new look-and-feel
				try {
					UIManager.setLookAndFeel(platName);
					SwingUtilities.updateComponentTreeUI(PlatFrame.this);
					pack();
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e1) {
					e1.printStackTrace();
				}
			}
		});
	}
	
	public static void main(String[] args) {
		JFrame frame = new PlatFrame();
		frame.setTitle("Plat Frame Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
