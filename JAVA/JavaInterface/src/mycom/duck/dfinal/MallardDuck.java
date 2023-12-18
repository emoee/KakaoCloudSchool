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
    	g.drawString("����", x, y);
    }

    @Override
    public void quack(Graphics g) {
    	g.drawString("�в�", x, y);
    	
    }

}
