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
	Button exitButton = new Button("�����ϱ�");
	Panel northpanel = new Panel();
	
	MyShape[] myshapes = new MyShape[30];
	private int count = 0;
	
	public MyFrame() {
		exitButton.addActionListener(new MyHandler());
		
		northpanel.add(exitButton); // ��ư�� ������Ʈ Ŭ������ ��ӹ��� Ŭ�����̴�.
		
		this.add(BorderLayout.NORTH, northpanel);
		this.addMouseListener(new MyMouseHandler());
	
		this.setSize(800, 600);
		this.setVisible(true);
	}
	
	// -- inner class
	// ��Ȱ�뵵�� ����������, myFrame ���� ��� ��Ҹ� �����Ӱ� ������ �� �ִٴ� ���ټ� ������ �����.
	class MyHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// ActionEvent e �̺�Ʈ�� �μ��� �߿���.
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
