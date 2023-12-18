package mycom.duck.frame;

import java.awt.Frame;
import java.awt.Graphics;

import mycom.duck.dfinal.Duck;

public class MyFrame extends Frame{
    public static int FRAME_WIDTH;
    public static int FRAME_HEIGHT;
    private Duck[] ducks;

    public MyFrame(){
    	this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    	this.setVisible(true);
    }

    private void makeDucks(){
    }

    public void paint(Graphics g){
    }

}
