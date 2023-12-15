package mycom.sfinal.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends mycom.sfinal.duck.Duck {

    public RubberDuck(){
    }

    public RubberDuck(int mx, int my){
    	super(mx, my);
    }

    @Override
	public void display(Graphics g) {
		g.setColor(Color.YELLOW);
		sound(g);
    }
    
    public void sound(Graphics g) {
    	g.drawString("²Ð²Ð", x, y);
    }

}
