package mycom.dept.duck;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class MyFrame extends Frame {
	public final int FRAME_WIDTH=800;
	public final int FRAME_HEIGHT=600;
	
	public MyFrame() {
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);
		
	}
	
	@Override
	public void paint(Graphics g) { // �ü���� �ٽ� �׷����� �� �ڵ����� ȣ����.
		g.setColor(new Color(0,0,128));
		g.fillOval(200, 100, 50, 50);
		
	}
	
	
}
