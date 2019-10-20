package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	JFrame pride = new JFrame("I hate jay frame");
	JPanel greed = new JPanel();
	JLabel sloth = new JLabel("");
	static Stack<String> strang = new Stack<String>();
	static String a;
	static String total = "";
	int lives = 7;
	static int num;
	int answered;
	public static void main(String[] args) {
		
		HangMan b = new HangMan();
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Enter a integer in between 1 and 266 inclusive: "));
		
		for (int i = 0; i < num; i++) {
			strang.push(Utilities.readRandomLineFromFile("dictionary.txt"));
		}
		a = strang.pop();
		
		for (int i = 0; i < a.length(); i++) {
			total += "_";
		}
		b.setup();
	}
	
	
	public void setup() {
		pride.add(greed);
		greed.add(sloth);
		sloth.setText(total);
		pride.addKeyListener(this);
	
		pride.pack();
		pride.setVisible(true);
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		Boolean noDeath = false;   
		for (int i = 0; i < a.length(); i++) {
			if(e.getKeyChar() == a.charAt(i)){
				total = total.substring(0, i) + a.charAt(i) + total.substring(i + 1, a.length());
				noDeath = true;
			}
		}
		sloth.setText(total);
		if (noDeath == false) {
			lives --;
		}
		if (lives == 0) {
			System.out.println("Dead");
			String yn = JOptionPane.showInputDialog("Would you like to play again?");
			if (yn.equalsIgnoreCase("yes")) {
				lives = 7;
			}
		}
		if(!total.contains("_")) {
			answered ++;
			if(num == answered) {
				System.out.println("You have Won!");
			}else {
				a = strang.pop();
				total = "";
				for (int i = 0; i < a.length(); i++) {
					total += "_";
					sloth.setText(total);
				}
			}
		}
		
			

	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}