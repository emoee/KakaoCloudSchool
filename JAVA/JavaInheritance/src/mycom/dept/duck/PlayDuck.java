package mycom.dept.duck;

public class PlayDuck {
	
    public static void main(String[] args) {
		Duck duck = new Duck();
		duck.display();
		duck.playSound();
		
		RedDuck redDuck = new RedDuck();
		redDuck.display();
		redDuck.swim();
		redDuck.display();
		
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.playSound();
	}

}
