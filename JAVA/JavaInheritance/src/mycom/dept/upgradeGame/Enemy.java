package mycom.dept.upgradeGame;

public class Enemy extends mycom.dept.upgradeGame.Character {

    public Enemy(){
    	this.myshape = "Enemy";
    }

    public Enemy(int mx, int my){
    	super(mx, my);
    	this.myshape = "Enemy";
    }
    
    @Override
    public void display() {
    	System.out.print("+++");
    	super.display();
    }
    

    public void moveUp(){
    	this.y -= 1;
    }

    public void moveDown(){
    	this.y += 1;
    }

}
