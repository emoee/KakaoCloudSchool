package mycom.dept.upgradeGame;

import java.util.Random;

public class Character {
	protected int x;
	protected int y;
	protected String myshape = "Character";
	
	public Character() {
		Random random = new Random();
		this.x = random.nextInt(800);
		this.y = random.nextInt(600);
	}
	
	public Character(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void display() {
		System.out.println(x + ", " + y + " = " + myshape);
	}
	
	public void moveLeft() {
		this.x -= 1;
	}
	
	public void moveRight() {
		this.x += 1;
	}
}
