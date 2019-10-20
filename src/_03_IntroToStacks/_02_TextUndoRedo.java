package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	JFrame pride = new JFrame("I hate jay frame");
	JPanel greed = new JPanel();
	JLabel sloth = new JLabel("");
	Stack<String> chare = new Stack<String>();
	public static void main(String[] args) {
		_02_TextUndoRedo a = new _02_TextUndoRedo();
		a.setup();
	}
	
	public void setup() {
		pride.add(greed);
		greed.add(sloth);
		pride.addKeyListener(this);
	
		pride.pack();
		pride.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getKeyChar() == KeyEvent.VK_BACK_SPACE){
			String temp = sloth.getText();
			chare.push(Character.toString(temp.charAt(temp.length() - 1)));
			String temp2 = "";
			for (int i = 0; i < (temp.length() - 1); i++) {
				temp2 += Character.toString(temp.charAt(i));
			}
			sloth.setText(temp2);
		}else if(e.getKeyChar() == KeyEvent.VK_ENTER) {
			sloth.setText(sloth.getText() + chare.pop());
		}else {
			System.out.println(e.getKeyChar());
			sloth.setText(sloth.getText() + e.getKeyChar());
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
