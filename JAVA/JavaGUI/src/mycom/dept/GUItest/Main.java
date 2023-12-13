package mycom.dept.GUItest;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.TextField;

public class Main {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(280, 190); 
		
		// ȭ�� ����
		Color colorBlue = new Color(0, 0, 128);
		Font fontTop = new Font("����", Font.BOLD, 20);
		Font fontBasic = new Font("����", Font.PLAIN, 16);
		Label labelTop = new Label(" �α��� ȭ�� ");
		Label labelID = new Label("���̵�: ");
		Label labelPW = new Label("��й�ȣ: ");
		TextField textID = new TextField(10);
		TextField textPW = new TextField(10);
		Button btnLogin = new Button("�α���");
		Button btnExit = new Button("���");
			
		labelTop.setBackground(colorBlue);
		labelTop.setForeground(Color.WHITE);
		labelTop.setFont(fontTop);
		labelTop.setAlignment(Font.CENTER_BASELINE);
		
		btnLogin.setBackground(colorBlue);
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(fontBasic);
		
		btnExit.setBackground(colorBlue);
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(fontBasic);
		
		LayoutManager layoutManager = new GridLayout(0,1,1,1);
		Panel pTopPanel = new Panel();
		Panel pCenterPanel = new Panel(layoutManager);
		
		Panel pIdPanel = new Panel();
		Panel pPwPanel = new Panel();
		Panel pBottomPanel = new Panel();
		
		// ��������
		pTopPanel.add(labelTop);
		
		pIdPanel.add(labelID);
		pIdPanel.add(textID);
		
		pPwPanel.add(labelPW);
		pPwPanel.add(textPW);
		
		pBottomPanel.add(btnLogin);
		pBottomPanel.add(btnExit);
		pBottomPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		pCenterPanel.add(pIdPanel);
		pCenterPanel.add(pPwPanel);
		pCenterPanel.add(pBottomPanel);
		
		f.add("North", pTopPanel);
		f.add("Center", pCenterPanel);
		
		f.setVisible(true);
	}

}
