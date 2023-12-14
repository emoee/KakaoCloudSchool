package mycom.dept.duck;

public class RedDuck extends Duck {
	
	String shape = "Red"; 
	// ����� �غ��� �θ� shape�� �ٸ��� �޸𸮿� �����ִ�.
	// this.shape�� super.shape���� �����Ͽ� ���� �����ϴ�.
	// �� ��õ���� ����.
	
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
