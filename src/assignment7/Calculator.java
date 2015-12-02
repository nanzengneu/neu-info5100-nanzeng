package assignment7;

import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

// Your calculator cannot correctly handle exceptions.
// If user input operation before input number, your calculator will throw exception.
// If user input two point, your calculator will also throw exception.
// Your calculator can only use one time, how can we clean the old data and re-use it?
public class Calculator extends JFrame implements ActionListener{
	JPanel[] row = new JPanel[5];
	JButton[] button = new JButton[16];
	String[] buttonString = {"7","8","9","+","4","5","6","-","1","2","3","*","0",".","/","="};
	boolean[] function = new boolean[4];
	double[] temporary = {0, 0};
	JTextArea displayArea = new JTextArea(1,15);
	Font font = new Font("Times new Roman", Font.BOLD, 15);
	
	public Calculator() {
		setTitle("Calc2");
		create();
		add();
		setSize(500, 500);
		setVisible(true);
	}
	
	private void add() {
		GridLayout gl = new GridLayout(5,4);
		Container con = super.getContentPane();
		con.setLayout(gl);
		displayArea.setFont(font);
		displayArea.setEditable(false);
		displayArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		for(int i = 0; i < 5; i++){
			row[i] = new JPanel();
		}
		row[0].add(displayArea);
		con.add(row[0]);
		for(int i = 0; i < 4; i++){
			row[1].add(button[i]);
			con.add(row[1]);
		}
		for(int i = 4; i < 8; i++){
			row[2].add(button[i]);
			con.add(row[2]);
		}
		for(int i = 8; i < 12; i++){
			row[3].add(button[i]);
			con.add(row[3]);
		}
		for(int i = 12; i < 16; i++){
			row[4].add(button[i]);
			con.add(row[4]);
		}
		
		
	}
	
	public void getResult(){
		double result = 0;
		temporary[1] = Double.parseDouble(displayArea.getText());
		String temp0 = Double.toString(temporary[0]);
		String temp1 = Double.toString(temporary[1]);
		try {
			if(temp0.contains("-")) {
				String[] temp00 = temp0.split("-", 2);
				temporary[1] = (Double.parseDouble(temp00[1]) * -1);
			}
			if(temp0.contains("-")) {
				String[] temp11 = temp1.split("-", 2);
				temporary[1] = (Double.parseDouble(temp11[1]) * -1);
			}
		} catch (ArrayIndexOutOfBoundsException e){
		}
		try {
			if(function[2] == true)
				result = temporary[0] * temporary[1];
			else if(function[3] == true)
				result = temporary[0] / temporary[1];
			else if(function[0] == true)
				result = temporary[0] + temporary[1];
			else if(function[1] == true)
				result = temporary[0] - temporary[1];
			displayArea.setText(Double.toString(result));
			for(int i = 0; i < 4; i++)
				function[i] = false;
		} catch(NumberFormatException e){
		}
	}

	private void create() {
		for(int i = 0; i < 16; i++) {
			button[i] = new JButton();
			button[i].setText(buttonString[i]);
			button[i].setFont(new Font("Times new Roman", Font.BOLD, 12));
			button[i].addActionListener(this);
		}
	}


	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == button[0])
			displayArea.append("7");
		if (ae.getSource() == button[1])
			displayArea.append("8");
		if (ae.getSource() == button[2])
			displayArea.append("9");
		if (ae.getSource() == button[3]){
			temporary[0] = Double.parseDouble(displayArea.getText());
			function[0] = true;
			displayArea.setText("");
		}
		if (ae.getSource() == button[4])
			displayArea.append("4");
		if (ae.getSource() == button[5])
			displayArea.append("5");
		if (ae.getSource() == button[6])
			displayArea.append("6");
		if (ae.getSource() == button[7]){
			temporary[0] = Double.parseDouble(displayArea.getText());
			function[1] = true;
			displayArea.setText("");
		}
		if (ae.getSource() == button[8])
			displayArea.append("1");
		if (ae.getSource() == button[9])
			displayArea.append("2");
		if (ae.getSource() == button[10])
			displayArea.append("3");
		if (ae.getSource() == button[11]){
			temporary[0] = Double.parseDouble(displayArea.getText());
			function[2] = true;
			displayArea.setText("");
		}
		if (ae.getSource() == button[12])
			displayArea.append("0");
		if (ae.getSource() == button[13])
			displayArea.append(".");
		if (ae.getSource() == button[14]){
			temporary[0] = Double.parseDouble(displayArea.getText());
			function[3] = true;
			displayArea.setText("");
		}
		if (ae.getSource() == button[15])
			getResult();
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
	}
}

