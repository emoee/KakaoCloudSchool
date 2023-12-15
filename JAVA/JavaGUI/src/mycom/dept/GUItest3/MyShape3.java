package mycom.dept.GUItest3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MyShape3 {
	private int x;
	private int y;
	private int starx[] = {50,35,0,23,20,50,80,73,100,65,50};
	private int stary[] = {0,30,40,65,100,85,100,65,40,30,0};
	private int shape;
	public static final int SHAPE_SIZE=50;
	
	public MyShape3() {
		Random random = new Random();
		this.x = random.nextInt(MyFrame3.FRAME_WIDTH-180)+60;
		this.y = random.nextInt(MyFrame3.FRAME_HEIGHT-240)+90;
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
		shape = random.nextInt(4);
		
		g.setColor(color);
		
		if (shape == 0) {
			g.fillOval(x, y, MyShape3.SHAPE_SIZE, MyShape3.SHAPE_SIZE);
		} else if (shape == 1) {
			int[] tx = {x, x+25, x+50};
			int[] ty = {y, y-40, y};
			g.fillPolygon(tx, ty, 3);
		} else if (shape == 2) {
			g.fillRect(x, y, MyShape3.SHAPE_SIZE, MyShape3.SHAPE_SIZE);
		} else {
			calStar();
			g.fillPolygon(starx, stary, 10);
		}
	}
}
