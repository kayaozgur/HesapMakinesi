package com.ozgur.kaya.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Gui extends JFrame {
	
	

	public Gui() {
		ÝnitPencere();
		
		
		
	}

	private void ÝnitPencere() {
		JPanel panel = ÝnitPanel();
		
		add(panel);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	private JPanel ÝnitPanel() {
		JPanel panel = new JPanel(new BorderLayout());
		
		JPanel textPanel = new JPanel();
		panel.add(textPanel,BorderLayout.NORTH);
		JTextField textField = new JTextField(20);
		textPanel.add(textField);
		
		
		JPanel buttonPanel = new JPanel(new GridLayout(4, 3));
		panel.add(buttonPanel,BorderLayout.CENTER);
		panel.setAlignmentX(5);
		panel.setAlignmentY(5);
		
		JButton button7 = new JButton("7");
		buttonPanel.add(button7);
				
		JButton button8 = new JButton("8");
		buttonPanel.add(button8);
		
		JButton button9 = new JButton("9");
		buttonPanel.add(button9);
		
		JButton button4 = new JButton("4");
		buttonPanel.add(button4);
				
		JButton button5 = new JButton("5");
		buttonPanel.add(button5);
		
		JButton button6 = new JButton("6");
		buttonPanel.add(button6);
		
		JButton button1 = new JButton("1");
		buttonPanel.add(button1);
				
		JButton button2 = new JButton("2");
		buttonPanel.add(button2);
		
		JButton button3 = new JButton("3");
		buttonPanel.add(button3);
		
		JButton button0 = new JButton("0");
		buttonPanel.add(button0);
				
		JButton button000 = new JButton("000");
		buttonPanel.add(button000);
		
		JButton buttonVirgul = new JButton(",");
		buttonPanel.add(buttonVirgul);
		
		JPanel islemPanel = new JPanel(new GridLayout(4, 2));
		panel.add(islemPanel,BorderLayout.EAST);
		islemPanel.setBorder(new EmptyBorder(0, 10, 0, 0));
		
		
		JButton buttunYuzde = new JButton("%");
		islemPanel.add(buttunYuzde);
		
		JButton buttunKarekok = new JButton("");
		islemPanel.add(buttunKarekok);
		
		JButton buttunX = new JButton("X");
		islemPanel.add(buttunX);
		
		JButton buttunBolu = new JButton("/");
		islemPanel.add(buttunBolu);
		
		JButton buttunArti = new JButton("+");
		islemPanel.add(buttunArti);
		
		JButton buttunEksi = new JButton("-");
		islemPanel.add(buttunEksi);
		
		JButton buttunEsit = new JButton("=");
		islemPanel.add(buttunEsit);
		
		JButton buttunC = new JButton("C");
		islemPanel.add(buttunC);
		
		return panel;
	}

}
