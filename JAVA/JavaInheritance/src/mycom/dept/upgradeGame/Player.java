package mycom.dept.upgradeGame;

public class Player extends Character {
	
	public Player() {
		// 서브클래스의 생성자는 자동으로 super();을 실행해 
		// 슈퍼 클래스의 생성자를 자동으로 부르게된다. 
		// 기본 생성자가 아닌 인수가 있는 생성자를 부를 때는
		// super(10,20); 이렇게 작성해 부르면 된다.
		
		this.myshape = "Player";
	}
	
	public Player(int mx, int my) {
		super(mx, my);
		this.myshape = "Player";
	}
	
	@Override // 메타정보를 시스템과 사용자(개발자)에게 모두 전달하기 위해 @기호를 사용한다.
	public void display() {
		System.out.print("*** ");
		super.display();
	}
	
	

}
