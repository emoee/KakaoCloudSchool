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
    	g.drawString("����", x, y);
    }
    
    public void sound(Graphics g) {
    	g.drawString("�в�", x, y);
    }

}
