package mycom.dept.duck;

public class RedDuck extends mycom.dept.duck.Duck {

    public RedDuck(){
    	this.shape = "RedDuck";
    }
    
    public RedDuck(int mx, int my) {
    	super(mx, my);
    	this.shape = "RedDuck";
    }

    @Override
    public void display() {
    	System.out.print("RED: ");
    	super.display();
    }
    
    @Override
    public void playSound() {
    	System.out.print("RED: ");
    	super.playSound();
    }

}
