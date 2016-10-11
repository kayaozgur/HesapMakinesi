package com.ozgur.kaya.gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Gui extends JFrame {
	
	NumberFormat format = new DecimalFormat("##,###.##");

	JTextField textField;
	int mSayı1=0;
	int mSayı2=0;
	int sonuc=0;
	String mIslem;
	

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
		panel.add(textPanel, BorderLayout.NORTH);
		textField = new JTextField(15);
		textPanel.add(textField);
		textField.setText("0");
		textField.setHorizontalAlignment(JTextField.RIGHT);
		textField.setFont(new Font("Arrial", 1, 18));

		JPanel buttonPanel = new JPanel(new GridLayout(4, 3));
		panel.add(buttonPanel, BorderLayout.CENTER);
		panel.setAlignmentX(5);
		panel.setAlignmentY(5);

		JButton button7 = new JButton("7");
		buttonPanel.add(button7);
		button7.setFont(new Font("Arrial", 1, 18));
		button7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				yaz("7");

			}
		});

		JButton button8 = new JButton("8");
		buttonPanel.add(button8);
		button8.setFont(new Font("Arrial", 1, 18));
		button8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				yaz("8");

			}
		});

		JButton button9 = new JButton("9");
		buttonPanel.add(button9);
		button9.setFont(new Font("Arrial", 1, 18));
		button9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				yaz("9");

			}
		});

		JButton button4 = new JButton("4");
		buttonPanel.add(button4);
		button4.setFont(new Font("Arrial", 1, 18));
		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				yaz("4");

			}
		});

		JButton button5 = new JButton("5");
		buttonPanel.add(button5);
		button5.setFont(new Font("Arrial", 1, 18));
		button5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				yaz("5");

			}
		});

		JButton button6 = new JButton("6");
		buttonPanel.add(button6);
		button6.setFont(new Font("Arrial", 1, 18));
		button6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				yaz("6");

			}
		});

		JButton button1 = new JButton("1");
		buttonPanel.add(button1);
		button1.setFont(new Font("Arrial", 1, 18));
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				yaz("1");

			}
		});

		JButton button2 = new JButton("2");
		buttonPanel.add(button2);
		button2.setFont(new Font("Arrial", 1, 18));
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				yaz("2");

			}
		});

		JButton button3 = new JButton("3");
		buttonPanel.add(button3);
		button3.setFont(new Font("Arrial", 1, 18));
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				yaz("3");

			}
		});

		JButton button0 = new JButton("0");
		buttonPanel.add(button0);
		button0.setFont(new Font("Arrial", 1, 18));
		button0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				yaz("0");

			}
		});

		JButton button000 = new JButton("000");
		buttonPanel.add(button000);
		button000.setFont(new Font("Arrial", 1, 18));
		button000.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				yaz("000");

			}
		});

		JButton buttonVirgul = new JButton(",");
		buttonPanel.add(buttonVirgul);
		buttonVirgul.setFont(new Font("Arrial", 1, 18));
		buttonVirgul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().indexOf(",") == -1) {

					if ("0".equals(textField.getText())) {
						textField.setText("0,");
					} else
						textField.setText(textField.getText() + ",");

				}
		        	}
		});

		JPanel islemPanel = new JPanel(new GridLayout(4, 2));
		panel.add(islemPanel, BorderLayout.EAST);
		islemPanel.setBorder(new EmptyBorder(0, 10, 0, 0));

		JButton buttonC = new JButton("C");
		islemPanel.add(buttonC);
		buttonC.setFont(new Font("Arrial", 1, 18));
		buttonC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				mSayı1=0;
				mIslem="";
				
			}
		});

		JButton buttonKarekok = new JButton("√");
		islemPanel.add(buttonKarekok);
		buttonKarekok.setFont(new Font("Arrial", 1, 18));

		JButton buttonX = new JButton("X");
		islemPanel.add(buttonX);
		buttonX.setFont(new Font("Arrial", 1, 18));
		buttonX.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				islemeAl("x");
				
			}
		});
		

		JButton buttonBolu = new JButton("÷");
		islemPanel.add(buttonBolu);
		buttonBolu.setFont(new Font("Arrial", 1, 18));
		buttonBolu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				islemeAl("÷");
				
			}
		});

		JButton buttonArti = new JButton("+");
		islemPanel.add(buttonArti);
		buttonArti.setFont(new Font("Arrial", 1, 18));
		buttonArti.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				islemeAl("+");
				
			}
		});

		JButton buttonEksi = new JButton("-");
		islemPanel.add(buttonEksi);
		buttonEksi.setFont(new Font("Arrial", 1, 18));
		buttonEksi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				islemeAl("-");
				
			}
		});

		JButton buttonEsit = new JButton("=");
		islemPanel.add(buttonEsit);
		buttonEsit.setFont(new Font("Arrial", 1, 18));
		buttonEsit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				switch (mIslem) {
				case "x":
					mSayı2= Integer.parseInt(textField.getText());
					sonuc= mSayı1*mSayı2;
					textField.setText(format.format(sonuc));
					break;
					
				case "÷":
					mSayı2= Integer.parseInt(textField.getText());
					sonuc= mSayı1/mSayı2;
					textField.setText(String.valueOf(sonuc));
					break;
					
				case "+":
					mSayı2= Integer.parseInt(textField.getText());
					sonuc= mSayı1+mSayı2;
					textField.setText(String.valueOf(sonuc));
					break;
					
				case "-":
					mSayı2= Integer.parseInt(textField.getText());
					sonuc= mSayı1-mSayı2;
					textField.setText(String.valueOf(sonuc));
					break;

				default:
					break;
				}
				
			}
		});

		JButton buttunYuzde = new JButton("%");
		islemPanel.add(buttunYuzde);
		buttunYuzde.setFont(new Font("Arrial", 1, 18));

		return panel;
	}

	protected void islemeAl(String i) {
		mSayı1= Integer.parseInt(textField.getText());
		mIslem=i;
		textField.setText("0");
		
	}

	protected void yaz(String s) {
		if ("0".equals(textField.getText())) {
			textField.setText(s);
		} else
			textField.setText(textField.getText() + s);
	}

}
