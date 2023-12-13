package mycom.dept.upgradeGame;

public class UpgradeGame {
	public static void main(String[] args) {
		Player player1 = new Player();
		player1.display();
		Player player2 = new Player(50, 500);
		player2.display();
		
		Enemy enemy1 = new Enemy();
		enemy1.display();
		enemy1.moveDown();
		enemy1.display();
		
		Enemy enemy2 = new Enemy(10, 40);
		enemy2.display();
	}
}
