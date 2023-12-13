package mycom.dept.duck;

import java.util.Random;

public class Duck {
    protected int x;
    protected int y;
    protected String shape = "Duck";
    protected String status = "normal";

    public Duck(){
    	Random random = new Random();
    	this.x = random.nextInt(100);
    	this.y = random.nextInt(100);
    }
    
    public Duck(int mx, int my) {
    	this.x = mx;
    	this.y = my;
    }

    public void swim(){
    	this.status = "swim";
    }

    public void display(){
    	System.out.println(shape + "=(" + x + "," + y + ")-" + status);
    }

    public void playSound(){
    	System.out.println("¿À¸®´Â ²Ð²Ð");
    }

}
