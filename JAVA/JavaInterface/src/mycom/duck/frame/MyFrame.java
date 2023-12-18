package mycom.duck.frame;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

import mycom.duck.dfinal.DecoyDuck;
import mycom.duck.dfinal.Duck;
import mycom.duck.dfinal.DuckManager;
import mycom.duck.dfinal.MallardDuck;
import mycom.duck.dfinal.RedDuck;
import mycom.duck.dfinal.RubberDuck;

public class MyFrame extends Frame{
    public static int FRAME_WIDTH=800;
    public static int FRAME_HEIGHT=600;
    DuckManager duckManager;
    
    public MyFrame(){
    	duckManager = new DuckManager();
    	this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    	this.setVisible(true);
    }

    public void paint(Graphics g){
    	duckManager.displayAllDucks(g);
    	duckManager.flyAllDucks(g);
    	duckManager.swimAllDucks(g);
    	duckManager.quackAllDucks(g);
    }

}
