package mycom.day10.GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import mycom.day10.GUI2.MyShape;

public class MyFrame extends Frame {
	Button colorButton = new Button("배경색 바꾸기");
	Button exitButton = new Button("종료하기");
	Panel northpanel = new Panel();
	
	public MyFrame() {
		colorButton.addActionListener(new MyHandler());
		exitButton.addActionListener(new MyHandler());
		
		northpanel.add(colorButton); // 업캐스팅
		northpanel.add(exitButton); // 버튼은 컴포넌트 클래스를 상속받은 클래스이다.
		
		this.add(BorderLayout.NORTH, northpanel);
		
		this.setSize(800, 600);
		this.setVisible(true);
	}
	
	// -- inner class
	class MyHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// ActionEvent e 이벤트는 인수가 중요함.
			if (e.getSource() == exitButton) {
				System.exit(0);
			} else if (e.getSource() == colorButton) {
				MyFrame.this.setBackground(new Color(92, 255, 209)); // inner 클래스에서 outer 클래스에 접근하는 방법
			}
			
			
		}
	}
}