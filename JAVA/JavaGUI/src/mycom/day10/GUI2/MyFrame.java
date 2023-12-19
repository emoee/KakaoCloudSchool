package mycom.day10.GUI2;

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
	Button exitButton = new Button("종료하기");
	Panel northpanel = new Panel();
	
	MyShape[] myshapes = new MyShape[30];
	private int count = 0;
	
	public MyFrame() {
		exitButton.addActionListener(new MyHandler());
		
		northpanel.add(exitButton); // 버튼은 컴포넌트 클래스를 상속받은 클래스이다.
		
		this.add(BorderLayout.NORTH, northpanel);
		this.addMouseListener(new MyMouseHandler());
	
		this.setSize(800, 600);
		this.setVisible(true);
	}
	
	// -- inner class
	// 재활용도는 떨어지지만, myFrame 안의 모든 요소를 자유롭게 접근할 수 있다는 접근성 때문에 사용함.
	class MyHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// ActionEvent e 이벤트는 인수가 중요함.
			if (e.getSource() == exitButton) {
				System.exit(0);
			}
		}
		
		
	}
	
	class MyMouseHandler extends MyMouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (count < 30) {
				MyShape myshape = new MyShape(e.getX(), e.getY());
				myshapes[count] = myshape;
				count += 1;
				//myshape.display(getGraphics());
			}
		}
	}
	
	@Override
	public void paint(Graphics g) {
		for (MyShape shape: myshapes) {
			if (shape != null) {
				shape.display(g);
			}
		}
	}

}
