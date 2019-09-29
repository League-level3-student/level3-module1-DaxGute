package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners	
	JFrame pride = new JFrame("I hate jay frame");
	JPanel greed = new JPanel();
	JButton sloth = new JButton("View Names");
	JButton glutony = new JButton("Add Name");
	ArrayList<String> guests = new ArrayList(0);
	public static void main(String[] args) {
		_02_GuestBook a = new _02_GuestBook();
		a.setup();
	}
	
	public void setup() {
	sloth.addActionListener(this);
	glutony.addActionListener(this);
	pride.add(greed);
	greed.add(glutony);
	greed.add(sloth);

	pride.pack();
	pride.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent evt) {
		Object src = evt.getSource();
		if (src == sloth) {
			for (int i = 0; i < guests.size(); i++) {
				System.out.println(guests.get(i));
			}
		}
		if (src == glutony) {
			String input = JOptionPane.showInputDialog("ggfsdfuygrsefgawiytefv?");
			guests.add(input);
		}
	}

	
	
	
	
}
