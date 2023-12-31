package mycom.dept.duck;

public class MallardDuck extends Duck {

    public MallardDuck(){
    	this.shape = "MallardDuck";
    }
    
    public MallardDuck(int mx, int my) {
    	super(mx, my);
    	this.shape = "MallardDuck";
    }

    @Override
    public void display() {
    	System.out.print("MALLARD: ");
    	System.out.println(shape + "=(" + x + "," + y + ")-" + status);
    }
    
    @Override
    public void playSound() {
    	System.out.print("MALLARD: ");
    	super.playSound();
    }

}
