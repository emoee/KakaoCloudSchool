package mycom.dept.GUItest3;

import java.awt.Frame;
import java.awt.Graphics;

public class MyFrame3 extends Frame {
	public static final int FRAME_WIDTH=800;
	public static final int FRAME_HEIGHT=600;
	public MyShape3[] shapes;
	
	public MyFrame3() {
		shapes = new MyShape3[10];
		
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);	
	}

	@Override
	public void paint(Graphics g) {
		for (MyShape3 shape: shapes) {
			shape = new MyShape3();
			shape.display(g);
		}
	}
}
