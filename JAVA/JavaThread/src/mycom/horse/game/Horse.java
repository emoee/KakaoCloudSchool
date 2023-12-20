package mycom.horse.game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Horse extends Canvas implements Runnable {
	public static final int HORSE_SIZE=30;
	private int x;
	private int y;
	private static int rank=1;
	private Color color;
	private Random random = new Random();
	
	public Horse() {
		this.x=0;
		this.y=10;
		color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
	}

	@Override
	public void run() {
		for (int i=0; i<75; i++) {
			if (x <= 750) {
				this.x = x+10;
				repaint();
				
				try {
					Thread.sleep(10*random.nextInt(20));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, HORSE_SIZE,HORSE_SIZE);
		
		if (this.x >= 750) {
			paintRank(g);
		}
	}
	
	private void paintRank(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawString("¼øÀ§: "+(rank++), x-HORSE_SIZE, y);
	}
}
