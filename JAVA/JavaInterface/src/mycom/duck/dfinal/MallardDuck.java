package mycom.duck.dfinal;

import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck implements IQuackable, IFlyable {

    public MallardDuck(){
    }

    public MallardDuck(int mx, int my){
    	super(mx, my);
    }

    @Override
    public void display(Graphics g){
    	g.setColor(Color.BLUE);
    	g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
    }

    @Override
    public void fly(Graphics g){
    	g.setColor(Color.BLUE);
    	g.drawString("³¯´Ù", x-15, y+40);
    }

    @Override
    public void quack(Graphics g) {
    	g.setColor(Color.BLUE);
    	g.drawString("²Ð²Ð", x+25, y);
    	
    }

}
