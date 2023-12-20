package mycom.horse.game;

import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.desktop.QuitStrategy;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import mycom.dept.test.MyThread;

public class MyFrame extends Frame{
	 public static final int FRAME_WIDTH=800;
	 public static final int FRAME_HEIGTH=600;
	 
	 private Button btn1 = new Button();
	 private Button btn2 = new Button();
	 
	 public final int HORSE_ARR_SIZE=5;
	 private Horse[] arr =new Horse[HORSE_ARR_SIZE];
	 
	 private boolean start;
	 
	 public MyFrame() {
		 makeHorse();
		 makeMainUi(); //화면구성
		 setSize(FRAME_WIDTH, FRAME_HEIGTH);
		 setVisible(true);
	 }
	 
	 public void makeHorse() {
		 for(int i=0; i<arr.length; i++){
			 arr[i]=new Horse();
		 }
	 }
	 
	 private void makeMainUi(){
		 //고급 그래픽
		 Panel pNorth = new Panel();
		 Panel pCenter = new Panel();
		 
		 btn1.setLabel("시작");
		 btn1.addActionListener(new MyBtnHandler());
		 btn2.setLabel("종료");
		 btn2.addActionListener(new MyBtnHandler());
		 
		 pNorth.add(btn1);
		 pNorth.add(btn2);
		 
		 pCenter.setLayout(new GridLayout(HORSE_ARR_SIZE,1));
		 

		 for(Horse h:arr){
			 pCenter.add(h);
		 }

		 
		 this.add("North",pNorth);
		 this.add("Center", pCenter);
	 }

	 class MyBtnHandler implements ActionListener {
		 LinkedList<Thread> t = new LinkedList<Thread>();
		 @Override
		 public void actionPerformed(ActionEvent e) {
			 if (e.getSource() == btn1) {
				 if (arr != null) {
					 for(Horse h:arr){
						 t.add(new Thread(h));
					 }
				 }
				 for(Thread thread: t){
					 thread.start();
				 }
			 } else if (e.getSource() == btn2) {
				 System.exit(0);
			 }
			 
		 }
	 }
}
