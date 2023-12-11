package mycom.dept.game;

import java.util.Random;

public class Player {
	private int x;
	private int y;
	private String shape;
	
	public Player() {
		Random random = new Random();
		x = random.nextInt(100);
		y = random.nextInt(200);
		shape = "Player";
	}
	
	public Player(int mx, int my) {
		// 메소드의 오버로딩
		this.x = mx;
		this.y = my;
		shape = "Player";
	}
	
	public void display() {
		System.out.print(x + ", " + y + ": ");
		System.out.println(shape);
	}

	public void moveLeft() {
		x = x - 1;
		display();
	}
	public void moveRight() {
		x = x + 1;
		display();
	}
}
