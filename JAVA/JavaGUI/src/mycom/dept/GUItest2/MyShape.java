package mycom.dept.GUItest2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MyShape{
	
	private Graphics graphics;
	private int x;
	private int y;
	
	public MyShape() {
		Random random = new Random();
		this.x = random.nextInt(MyFrame2.FRAME_WIDTH);
		this.y = random.nextInt(MyFrame2.FRAME_HEIGHT);
	}
	
	public void display(Graphics g) {
		Random random = new Random();
		Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
		
		this.graphics = g;
		this.graphics.setColor(color);
		this.graphics.fillOval(this.x, this.y, 40, 40);
	}
}
