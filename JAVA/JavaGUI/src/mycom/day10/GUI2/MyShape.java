package mycom.day10.GUI2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import mycom.dept.GUItest3.MyShape3;

public class MyShape {
	private int x;
	private int y;
	private int starx[] = {50,35,0,23,20,50,80,73,100,65,50};
	private int stary[] = {0,30,40,65,100,85,100,65,40,30,0};
	private int type;
	private Color color;
	public static final int SHAPE_SIZE = 50;
	
	public MyShape(int mx, int my) {
		this.x = mx-SHAPE_SIZE/2;
		this.y = my-SHAPE_SIZE/2;
		
		Random random = new Random();
		this.type = random.nextInt(4);
		this.color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
	}
	
	private void calStar() {
		for (int i=0; i<starx.length; i++) {
			starx[i] += x;
			stary[i] += y;
		}
	}
	
	public void display(Graphics g) {
		g.setColor(color);
		
		switch (type) {
		case 0: 
			g.fillOval(x, y, SHAPE_SIZE, SHAPE_SIZE);
			break;
		case 1:
			int[] tx = {x, x+25, x+50};
			int[] ty = {y, y-40, y};
			g.fillPolygon(tx, ty, 3);
			break;
		case 2:	
			g.fillRect(x, y, SHAPE_SIZE, SHAPE_SIZE);
			break;
		case 3:
			calStar();
			g.fillPolygon(starx, stary, 10);
			break;
		default:
			g.fillOval(x, y, SHAPE_SIZE, SHAPE_SIZE);
		}
	}

}
