package mycom.dept.duck;

public class PlayDuck {
	
    public static void main(String[] args) {
    	// �������� �����迭
		MallardDuck[] ducks = new MallardDuck[10]; 
		for(MallardDuck duck: ducks) {
			duck = new MallardDuck(); // �������� �迭�� �׻� �� �����ϰ� ����ؾ��Ѵ�.
			duck.display();
		}
	}

}
