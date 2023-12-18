package mycom.duck.dfinal;

import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck implements IQuackable, IFlyable {

    public RedDuck(){
    }

    public RedDuck(int mx, int my){
    }

    @Override
    public void display(Graphics g){
    	g.setColor(Color.RED);
    	g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
    }

    @Override
    public void fly(Graphics g){
    	g.setColor(Color.RED);
    	g.drawString("³¯´Ù", x-15, y+40);
    }

    @Override
    public void quack(Graphics g) {
    	g.setColor(Color.RED);
    	g.drawString("²Ð²Ð", x+25, y);
    	
    }

}
