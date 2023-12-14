package mycom.dept.duck;

public class PlayDuck {
	
    public static void main(String[] args) {
    	// 참조형의 정적배열
		MallardDuck[] ducks = new MallardDuck[10]; 
		for(MallardDuck duck: ducks) {
			duck = new MallardDuck(); // 참조형의 배열은 항상 꼭 생성하고 사용해야한다.
			duck.display();
		}
	}

}
