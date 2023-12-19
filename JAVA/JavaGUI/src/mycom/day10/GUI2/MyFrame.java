package mycom.day10.GUI2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import mycom.day10.GUI2.MyShape;

public class MyFrame extends Frame {
	Button exitButton = new Button("�����ϱ�");
	Panel northpanel = new Panel();
	
	LinkedList<MyShape> myshapes = new LinkedList<MyShape>();
	
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
		public void mousePressed(MouseEvent e) {
			myshapes.add(new MyShape(e.getX(), e.getY()));
			repaint(); // repaint()->update(g)->paint(g)
			// for������ repaint�ϸ� �ȵȴ�. for���� �ӵ��� ������ ������ ������ ����Ͱ� �����󰣴�.
			// paint�� ���� ���� �ҷ��� ȭ�鿡 �ƹ��͵� �������ʱ� ������ repaint�� ȣ���ϴ� ���̴�.
		}
	}
	
	@Override
	public void paint(Graphics g) {
		if (myshapes != null) {
			for (MyShape shape: myshapes) {
				shape.display(g);
			}
		}
	}

}
