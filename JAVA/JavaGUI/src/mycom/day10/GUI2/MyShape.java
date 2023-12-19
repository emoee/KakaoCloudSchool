package mycom.day10.GUI2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import mycom.dept.GUItest3.MyShape3;

public class MyShape {
	private int x;
	private int y;
	private int type;
	private Color color;
	public static final int SHAPE_SIZE = 50;
	
	public MyShape(int mx, int my) {
		this.x = mx-SHAPE_SIZE/2;
		this.y = my-SHAPE_SIZE/2;
		
		Random random = new Random();
		this.type = random.nextInt(3);
		this.color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
	}
	
	public void display(Graphics g) {
		g.setColor(color);
		
		switch (type) {
		case 0: 
			g.fillOval(x, y, SHAPE_SIZE, SHAPE_SIZE);
			break;
		case 1:
			int[] tx = {x, x+25, x+50};
			int[] ty = {y+50, y, y+50};
			g.fillPolygon(tx, ty, 3);
			break;
		case 2:	
			g.fillRect(x, y, SHAPE_SIZE, SHAPE_SIZE);
			break;
		default:
			g.fillOval(x, y, SHAPE_SIZE, SHAPE_SIZE);
		}
	}

}
