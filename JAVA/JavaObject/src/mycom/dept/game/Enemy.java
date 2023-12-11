package mycom.dept.game;

import java.util.Random;

public class Enemy {
	private int x;
	private int y;
	private String shape;
	
	public Enemy() {
		Random random = new Random();
		x = random.nextInt(100);
		y = random.nextInt(200);
		shape = "Enemy";
	}
	
	public Enemy(int mx, int my) {
		// 메소드의 오버로딩
		this.x = mx;
		this.y = my;
		shape = "Enemy";
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
	
	public void moveUp() {
		y = y - 1;
		display();
	}
	
	public void moveDown() {
		y = y + 1;
		display();
	}
}
