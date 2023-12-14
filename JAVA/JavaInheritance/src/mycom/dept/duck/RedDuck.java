package mycom.dept.duck;

public class RedDuck extends Duck {
	
	String shape = "Red"; 
	// 디버깅 해보면 부모에 shape과 다르게 메모리에 잡혀있다.
	// this.shape과 super.shape으로 구분하여 접근 가능하다.
	// 단 추천하지 않음.
	
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
    	System.out.println(shape + "=(" + x + "," + y + ")-" + status);
    }
    
    @Override
    public void playSound() {
    	System.out.print("RED: ");
    	super.playSound();
    }

}
