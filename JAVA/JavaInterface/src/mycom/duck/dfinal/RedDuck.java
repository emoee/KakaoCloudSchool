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
    	g.drawString("����", x, y);
    }

    @Override
    public void quack(Graphics g) {
    	g.drawString("�в�", x, y);
    	
    }

}
