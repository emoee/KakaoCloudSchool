package mycom.sfinal.duck;

import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck {

    public MallardDuck(){
    }

    public MallardDuck(int mx, int my){
    	super(mx, my);
    }

    @Override
	public void display(Graphics g) {
		g.setColor(Color.BLUE);
		fly(g);
		sound(g);
    }

    public void fly(Graphics g){
    	g.drawString("³¯±â", x, y);
    }
    
    public void sound(Graphics g) {
    	g.drawString("²Ð²Ð", x, y);
    }

}
