package mycom.dept.GUItest3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Random;

public class MyShape3 {
	private int x;
	private int y;
	private int starx[] = {50,35,0,23,20,50,80,73,100,65,50};
	private int stary[] = {0,30,40,65,100,85,100,65,40,30,0};
	private int shape;
	private Graphics graphics;
	
	public MyShape3() {
		Random random = new Random();
		this.x = random.nextInt(MyFrame3.FRAME_WIDTH);
		this.y = random.nextInt(MyFrame3.FRAME_HEIGHT);
	}
	
	private void calStar() {
		for (int i=0; i<starx.length; i++) {
			starx[i] += x;
			stary[i] += y;
		}
	}
	
	public void display(Graphics g) {
		Random random = new Random();
		Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
		this.shape = random.nextInt(4);
		
		this.graphics = g;
		this.graphics.setColor(color);
		
		if (shape == 0) {
			this.graphics.fillOval(this.x, this.y, 40, 40);
		} else if (shape == 1) {
			int[] tx = {this.x, this.x+25, this.x+50};
			int[] ty = {this.y, this.y-40, this.y};
			this.graphics.fillPolygon(tx, ty, 3);
		} else if (shape == 2) {
			this.graphics.fillRect(this.x, this.y, 40, 40);
		} else {
			calStar();
			this.graphics.fillPolygon(starx, stary, 10);
		}
	}
}
