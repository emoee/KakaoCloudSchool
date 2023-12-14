package mycom.dept.duck;

public class PlayDuck {
	
    public static void main(String[] args) {
		
    	RedDuck redDuck = new RedDuck();
		redDuck.swim();
		redDuck.display();
		redDuck.playSound();
		
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.playSound();
		
	}

}
