package mycom.sfinal.duck;

import java.awt.Graphics;
import java.util.Random;

import mycom.sfinal.frameduck.MyFrame;

public abstract class Duck {
    protected int x;
    protected int y;
    public static int DUCK_SIZE;

    public Duck(){
    	Random random = new Random();
    	this.x = random.nextInt(MyFrame.FRAME_WIDTH-100)+70;
    	this.y = random.nextInt(MyFrame.FRAME_HEIGHT-170)+110;
    }

    public Duck(int mx, int my){
    	this.x = mx;
    	this.y = my;
    }

    public abstract void display(Graphics g);

    public void swim(Graphics g){
    	g.drawString("¼ö¿µ", x, y);
    }

}
