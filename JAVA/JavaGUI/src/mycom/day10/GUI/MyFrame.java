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
	Button colorButton = new Button("���� �ٲٱ�");
	Button exitButton = new Button("�����ϱ�");
	Panel northpanel = new Panel();
	
	public MyFrame() {
		colorButton.addActionListener(new MyHandler());
		exitButton.addActionListener(new MyHandler());
		
		northpanel.add(colorButton); // ��ĳ����
		northpanel.add(exitButton); // ��ư�� ������Ʈ Ŭ������ ��ӹ��� Ŭ�����̴�.
		
		this.add(BorderLayout.NORTH, northpanel);
		
		this.setSize(800, 600);
		this.setVisible(true);
	}
	
	// -- inner class
	class MyHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// ActionEvent e �̺�Ʈ�� �μ��� �߿���.
			if (e.getSource() == exitButton) {
				System.exit(0);
			} else if (e.getSource() == colorButton) {
				MyFrame.this.setBackground(new Color(92, 255, 209)); // inner Ŭ�������� outer Ŭ������ �����ϴ� ���
			}
			
			
		}
	}
}