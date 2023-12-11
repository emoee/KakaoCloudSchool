package mycom.dept.game;

public class Play {
	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player(10, 500);
		Enemy enemy1 = new Enemy();
		Enemy enemy2 = new Enemy();
		Enemy enemy3 = new Enemy(10,20);
		Enemy enemy4 = new Enemy(30,20);
		
		player1.display();
		player1.moveLeft();
		player2.display();
		
		enemy1.display();
		enemy1.moveUp();
	}
}
