package com.jhanu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Demo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-157,484
	 */
	private final JLabel label = new JLabel("New label");
	private JTextField textnum1;
	private JTextField textnum2;
	private JTextField result;
	/**
	 * @wbp.nonvisual location=-147,354
	 */
	private final JLabel label_1 = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo frame = new Demo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Demo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(128, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnum1 = new JLabel("Num 1");
		lblnum1.setBounds(106, 60, 45, 13);
		lblnum1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblnum1);
		
		JLabel lblnum2 = new JLabel("Num 2");
		lblnum2.setBounds(106, 89, 45, 13);
		lblnum2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblnum2);
		
		JButton btnadd = new JButton("ADD");
		btnadd.setBounds(43, 160, 75, 21);
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int a=Integer.parseInt(textnum1.getText());
				int b=Integer.parseInt(textnum2.getText());
				int sum=(a+b);
				result.setText(Integer.toString(sum));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"please enter valid number");
				}
			}
		});
		contentPane.add(btnadd);
		
		JButton btnsub = new JButton("SUB");
		btnsub.setBounds(143, 160, 75, 21);
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a=Integer.parseInt(textnum1.getText());
					int b=Integer.parseInt(textnum2.getText());
					int res=(a-b);
					result.setText(Integer.toString(res));
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(null,"please enter valid number");
					}
			}
		});
		contentPane.add(btnsub);
		
		JButton btnmul = new JButton("MUL");
		btnmul.setBounds(239, 160, 69, 21);
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a=Integer.parseInt(textnum1.getText());
					int b=Integer.parseInt(textnum2.getText());
					int res=(a*b);
					result.setText(Integer.toString(res));
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(null,"please enter valid number");
					}
			}
		});
		contentPane.add(btnmul);
		
		JButton btndiv = new JButton("DIV");
		btndiv.setBounds(334, 160, 69, 21);
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a=Integer.parseInt(textnum1.getText());
					int b=Integer.parseInt(textnum2.getText());
					int res=(a/b);
					result.setText(Integer.toString(res));
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(null,"please enter valid number");
					}
			}
		});
		contentPane.add(btndiv);
		
		JLabel lblresult = new JLabel("Result");
		lblresult.setBounds(106, 119, 45, 13);
		lblresult.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblresult);
		
		textnum1 = new JTextField();
		textnum1.setBounds(196, 57, 96, 19);
		textnum1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(textnum1);
		textnum1.setColumns(10);
		
		textnum2 = new JTextField();
		textnum2.setBounds(196, 86, 96, 19);
		textnum2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(textnum2);
		textnum2.setColumns(10);
		
		result = new JTextField();
		result.setBounds(196, 115, 96, 19);
		result.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(result);
		result.setColumns(10);
		
		JButton btnreset = new JButton("RESET");
		btnreset.setBounds(196, 201, 85, 21);
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textnum1.setText("");
				textnum2.setText("");
				result.setText("");
				
			}
		});
		contentPane.add(btnreset);
		
		JLabel lblNewLabel = new JLabel("Simple Calculator");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setBounds(143, 10, 147, 18);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("*Enter any two numbers to perform simple Operations");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 10));
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setBounds(43, 38, 265, 13);
		contentPane.add(lblNewLabel_1);
	}
}
