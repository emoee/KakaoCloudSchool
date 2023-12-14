package mycom.dept.GUItest2;

import java.awt.Frame;
import java.awt.Graphics;

public class MyFrame2 extends Frame{
	public final static int FRAME_WIDTH=800;
	public final static int FRAME_HEIGHT=600;
	public MyShape[] shapes;
	
	public MyFrame2() {
		shapes= new MyShape[10];
		for (int i=0; i<shapes.length; i++) {
			shapes[i] = new MyShape();
		}
		
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);	
	}
	
	@Override
	public void paint(Graphics g) {
		for (MyShape shape: shapes) {
			shape.display(g);
		}
	}
}
