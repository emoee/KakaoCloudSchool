package mycom.sfinal.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck {

    public RedDuck(){
    }

    public RedDuck(int mx, int my){
    }


	@Override
	public void display(Graphics g) {
		g.setColor(Color.RED);
	}
	
    public void fly(Graphics g){
    	g.drawString("³¯±â", x, y);
    	fly(g);
    	sound(g);
    }
    
    public void sound(Graphics g) {
    	g.drawString("²Ð²Ð", x, y);
    }

}
