package assignment7;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ReadFrame extends JFrame {
	
	private JButton clickButton;
	private JTextArea textArea;
	private ArrayList<String> lines;
	private int count = 0;
	
	public ReadFrame(String string) throws IOException{
		setTitle("Read Array List");
		create();
		add();
		addListener();
		display();
		lines = new ReadFiles(string).readLineByLine();
		count = 0;
		
	}
	
	private void create() {
		clickButton = new JButton("Click");
		textArea = new JTextArea();
		
	}

	private void add() {
		BorderLayout bl = new BorderLayout();
		Container con = super.getContentPane();
		con.add("North", clickButton);
		con.add("South", textArea);
	
	}

	private void addListener() {
		ClickAction ca = new ClickAction();
		clickButton.addActionListener(ca);
		
	}
	
	class ClickAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent ae){
			if(count == lines.size()) {
				JOptionPane.showMessageDialog(null, "Alert: Nothing Left!");
			} else {
				textArea.append(lines.get(count++)+"\n");
			}
			
		}
		
	}

	private void display() {
		setSize(500,500);
		textArea.setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) throws IOException {
		new ReadFrame("/Users/abc/Documents/Java/data.txt");

	}

}
