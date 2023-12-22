package mycom.duck.dfinal;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import mycom.duck.frame.MyFrame;

public abstract class Duck {
    protected int x;
    protected int y;
    public static final int DUCK_SIZE=30;

    public Duck(){
    	Random random = new Random();
    	this.x = random.nextInt(MyFrame.FRAME_WIDTH-100)+60;
    	this.y = random.nextInt(MyFrame.FRAME_HEIGHT-150)+80;
    }

    public Duck(int mx, int my){
    	this.x = mx;
    	this.y = my;
    }

    public abstract void display(Graphics g);

    public void swim(Graphics g){
        g.setColor(Color.GRAY);
    	g.drawString("수영", x-15, y);
    }

}
