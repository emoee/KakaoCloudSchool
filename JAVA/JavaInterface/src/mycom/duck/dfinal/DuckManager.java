package mycom.duck.dfinal;

import java.awt.Graphics;
import java.util.Random;

public class DuckManager {
	private Duck[] ducks = new Duck[20];
	
	public DuckManager() {
		makeDucks();
	}
	
	private void makeDucks(){
    	Random random = new Random();
		int type = 0;
		if (ducks != null) {
			for (int i=0; i<ducks.length; i++) {
				type = random.nextInt(4);
				switch (type) {
					case 0:
						ducks[i] = new RedDuck();
						break;
					case 1:
						ducks[i] = new MallardDuck();
						break;
					case 2:
						ducks[i] = new RubberDuck();
						break;
					case 3:
						ducks[i] = new DecoyDuck();
						break;
					default:
						ducks[i] = new MallardDuck();
				}
			}
		}
    }

    public void displayAllDucks(Graphics g){
    	for (Duck duck: ducks) {
    		duck.display(g);
    	}
    }

    public void swimAllDucks(Graphics g){
    	for (Duck duck: ducks) {
    		duck.swim(g);
    	}
    }

    public void quackAllDucks(Graphics g){
    	for (Duck duck: ducks) {
    		if (duck instanceof IQuackable) {
    			IQuackable duckIQuackable = (IQuackable) duck;
    			duckIQuackable.quack(g);
    		}
    	}
    }

    public void flyAllDucks(Graphics g){
    	for (Duck duck: ducks) {
    		if (duck instanceof IFlyable) {
    			IFlyable duckfFlyable = (IFlyable) duck;
    			duckfFlyable.fly(g);
    		}
    	}
    }

}
