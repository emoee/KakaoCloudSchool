package mycom.dept.upgradeGame;

public class Player extends Character {
	
	public Player() {
		// ����Ŭ������ �����ڴ� �ڵ����� super();�� ������ 
		// ���� Ŭ������ �����ڸ� �ڵ����� �θ��Եȴ�. 
		// �⺻ �����ڰ� �ƴ� �μ��� �ִ� �����ڸ� �θ� ����
		// super(10,20); �̷��� �ۼ��� �θ��� �ȴ�.
		
		this.myshape = "Player";
	}
	
	public Player(int mx, int my) {
		super(mx, my);
		this.myshape = "Player";
	}
	
	@Override // ��Ÿ������ �ý��۰� �����(������)���� ��� �����ϱ� ���� @��ȣ�� ����Ѵ�.
	public void display() {
		System.out.print("*** ");
		super.display();
	}
	
	

}
