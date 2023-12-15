package mycom.exam.upgradeduck;

import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck {

	public MallardDuck(){
    }
    
    public MallardDuck(int mx, int my) {
    	super(mx, my);
    }

    @Override
    public void display(Graphics g) {
    	g.setColor(Color.BLUE);
    	g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
    }

}
