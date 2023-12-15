package mycom.sfinal.frameduck;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

import mycom.sfinal.duck.DecoyDuck;
import mycom.sfinal.duck.Duck;
import mycom.sfinal.duck.MallardDuck;
import mycom.sfinal.duck.RedDuck;
import mycom.sfinal.duck.RubberDuck;

public class MyFrame extends Frame {
    public static int FRAME_WIDTH=800;
    public static int FRAME_HEIGHT=600;
    private Duck[] ducks=new Duck[20];

    public MyFrame(){
    	makeDucks();
    	this.setSize(FRAME_WIDTH, FRAME_WIDTH);
    	this.setVisible(true);
    }

    private void makeDucks(){
    	Random random = new Random();
    	int type = 0;
    	for (int i=0; i<ducks.length; i++) {
    		type = random.nextInt(3);
    		switch (type) {
			case 0: {
				ducks[i] = new MallardDuck();
			}
			case 1: {
				ducks[i] = new RedDuck();
			}
			case 2: {
				ducks[i] = new RubberDuck();
			}
			case 3: {
				ducks[i] = new DecoyDuck();
			}
			default:
				ducks[i] = new DecoyDuck();
			}
    	}
    }

    public void paint(Graphics g){
    	if (ducks != null) {
    		for (Duck duck: ducks) {
    			duck.display(g);
    		}
    	}
    }

}
