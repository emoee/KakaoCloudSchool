package mycom.exam.frameduck;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

import mycom.exam.upgradeduck.MallardDuck;
import mycom.exam.upgradeduck.RedDuck;
import mycom.exam.upgradeduck.Duck;

public class MyFrame extends Frame {
	public static final int FRAME_WIDTH=800;
	public static final int FRAME_HEIGHT=600;
    private Duck[] ducks = new Duck[20];

    public MyFrame(){
    	makeDucks();
    	this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);	
    }

	private void makeDucks() { // 업캐스팅
		Random random = new Random();
		int type = 0;
		if (ducks != null) {
			for (int i=0; i<ducks.length; i++) {
				type = random.nextInt(2);
				switch (type) {
				case 0: {
					ducks[i] = new RedDuck();
					break;
				}
				case 1:
					ducks[i] = new MallardDuck();
					break;
				default:
					ducks[i] = new MallardDuck();
				}
			}
		}
	}

    public void paint(Graphics g){
    	for (Duck duck : ducks) {
			duck.display(g); // 오버라이드된 메소드가 호출됨
			duck.swim(g);
			duck.quack(g);
		}
    }

}
