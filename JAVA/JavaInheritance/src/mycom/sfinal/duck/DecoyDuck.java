package mycom.sfinal.duck;

import java.awt.Color;
import java.awt.Graphics;

public class DecoyDuck extends mycom.sfinal.duck.Duck {

    public DecoyDuck(){
    }

    public DecoyDuck(int mx, int my){
    	super(mx, my);
    }

    @Override
	public void display(Graphics g) {
		g.setColor(Color.GREEN);
    }

}
