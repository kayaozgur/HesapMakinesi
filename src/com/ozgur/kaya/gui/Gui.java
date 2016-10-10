package com.ozgur.kaya.gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Gui extends JFrame {
	
	

	public Gui() {
		İnitPencere();
		
		
		
	}

	private void İnitPencere() {
		JPanel panel = İnitPanel();
		
		add(panel);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	private JPanel İnitPanel() {
		JPanel panel = new JPanel(new BorderLayout());
		
		JPanel textPanel = new JPanel();
		panel.add(textPanel,BorderLayout.NORTH);
		JTextField textField = new JTextField(15);
		textPanel.add(textField);
		textField.setText("0");
		textField.setHorizontalAlignment(JTextField.RIGHT);
		textField.setFont(new Font("Arrial", 1, 18));
		
		
		JPanel buttonPanel = new JPanel(new GridLayout(4, 3));
		panel.add(buttonPanel,BorderLayout.CENTER);
		panel.setAlignmentX(5);
		panel.setAlignmentY(5);
		
		JButton button7 = new JButton("7");
		buttonPanel.add(button7);
		button7.setFont(new Font("Arrial", 1, 18));
				
		JButton button8 = new JButton("8");
		buttonPanel.add(button8);
		button8.setFont(new Font("Arrial", 1, 18));
		
		JButton button9 = new JButton("9");
		buttonPanel.add(button9);
		button9.setFont(new Font("Arrial", 1, 18));
		
		JButton button4 = new JButton("4");
		buttonPanel.add(button4);
		button4.setFont(new Font("Arrial", 1, 18));
				
		JButton button5 = new JButton("5");
		buttonPanel.add(button5);
		button5.setFont(new Font("Arrial", 1, 18));
		
		JButton button6 = new JButton("6");
		buttonPanel.add(button6);
		button6.setFont(new Font("Arrial", 1, 18));
		
		JButton button1 = new JButton("1");
		buttonPanel.add(button1);
		button1.setFont(new Font("Arrial", 1, 18));
				
		JButton button2 = new JButton("2");
		buttonPanel.add(button2);
		button2.setFont(new Font("Arrial", 1, 18));
		
		JButton button3 = new JButton("3");
		buttonPanel.add(button3);
		button3.setFont(new Font("Arrial", 1, 18));
		
		JButton button0 = new JButton("0");
		buttonPanel.add(button0);
		button0.setFont(new Font("Arrial", 1, 18));
				
		JButton button000 = new JButton("000");
		buttonPanel.add(button000);
		button000.setFont(new Font("Arrial", 1, 18));
		
		JButton buttonVirgul = new JButton(",");
		buttonPanel.add(buttonVirgul);
		buttonVirgul.setFont(new Font("Arrial", 1, 18));
		
		JPanel islemPanel = new JPanel(new GridLayout(4, 2));
		panel.add(islemPanel,BorderLayout.EAST);
		islemPanel.setBorder(new EmptyBorder(0, 10, 0, 0));
		
		
		JButton buttunYuzde = new JButton("%");
		islemPanel.add(buttunYuzde);
		buttunYuzde.setFont(new Font("Arrial", 1, 18));
		
		JButton buttunKarekok = new JButton("√");
		islemPanel.add(buttunKarekok);
		buttunKarekok.setFont(new Font("Arrial", 1, 18));
		
		JButton buttunX = new JButton("X");
		islemPanel.add(buttunX);
		buttunX.setFont(new Font("Arrial", 1, 18));
		
		JButton buttunBolu = new JButton("÷");
		islemPanel.add(buttunBolu);
		buttunBolu.setFont(new Font("Arrial", 1, 18));
		
		JButton buttunArti = new JButton("+");
		islemPanel.add(buttunArti);
		buttunArti.setFont(new Font("Arrial", 1, 18));
		
		JButton buttunEksi = new JButton("-");
		islemPanel.add(buttunEksi);
		buttunEksi.setFont(new Font("Arrial", 1, 18));
		
		JButton buttunEsit = new JButton("=");
		islemPanel.add(buttunEsit);
		buttunEsit.setFont(new Font("Arrial", 1, 18));
		
		JButton buttunC = new JButton("C");
		islemPanel.add(buttunC);
		buttunC.setFont(new Font("Arrial", 1, 18));
		
		return panel;
	}

}
