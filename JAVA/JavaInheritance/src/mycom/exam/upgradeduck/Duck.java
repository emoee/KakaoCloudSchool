package mycom.exam.upgradeduck;

import java.awt.Graphics;
import java.util.Random;

import mycom.exam.frameduck.MyFrame;

public abstract class Duck {
	
    protected int x;
    protected int y;
    public static final int DUCK_SIZE = 50;
    

    public Duck(){
    	Random random = new Random();
    	this.x = random.nextInt(MyFrame.FRAME_WIDTH-180)+60;
    	this.y = random.nextInt(MyFrame.FRAME_HEIGHT-240)+90;
    }
    
    public Duck(int mx, int my) {
    	this.x = mx;
    	this.y = my;
    }
    
    public abstract void display(Graphics g);
    
    public void swim(Graphics g) {
    	g.drawString("¼ö¿µ", x-1, y-1);
    }
    public void quack(Graphics g) {
    	g.drawString("²Ð²Ð", x+DUCK_SIZE-20, y-1);
    }
}
