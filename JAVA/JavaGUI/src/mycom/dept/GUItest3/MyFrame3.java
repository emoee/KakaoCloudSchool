package mycom.dept.GUItest3;

import java.awt.Frame;
import java.awt.Graphics;

public class MyFrame3 extends Frame {
	public static final int FRAME_WIDTH=800;
	public static final int FRAME_HEIGHT=600;
	private MyShape3[] shapes;
	
	public MyFrame3(int count) {
		shapes = new MyShape3[count];
		
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);	
	}

	@Override
	public void paint(Graphics g) {
		makeShape();
		for (MyShape3 shape: shapes) {
			shape.display(g);
		}
	}

	private void makeShape() {
		if (shapes != null) {
			for (int i = 0; i<shapes.length; i++) {
				shapes[i] = new MyShape3();
			}
		}
	}
}
