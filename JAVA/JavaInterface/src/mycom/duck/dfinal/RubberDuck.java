package mycom.duck.dfinal;

import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends Duck implements IQuackable {

    public RubberDuck(){
    }

    public RubberDuck(int mx, int my){
    	super(mx, my);
    }

    @Override
    public void display(Graphics g){
    	g.setColor(Color.YELLOW);
    	g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
    }

    @Override
    public void quack(Graphics g) {
    	g.drawString("»à»à", x, y);
    	
    }

}
