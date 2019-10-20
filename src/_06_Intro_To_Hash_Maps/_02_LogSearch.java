package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener{
	JFrame I = new JFrame();
	JPanel hate = new JPanel();
	JButton AddEntry = new JButton("Add Entry");
	JButton search = new JButton("Search by ID");
	JButton ViewList = new JButton("View List");
	JButton RemoveEntry = new JButton("Remove Entry");
	HashMap<Integer, String> list = new HashMap<Integer, String>();
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	public static void main(String[] args) {
		_02_LogSearch a = new _02_LogSearch();
		a.setup();
	}

	private void setup() {
		I.add(hate);
		hate.add(AddEntry);
		hate.add(search);
		hate.add(ViewList);
		hate.add(RemoveEntry);
		AddEntry.addActionListener(this);
		search.addActionListener(this);
		ViewList.addActionListener(this);
		RemoveEntry.addActionListener(this);
		
		I.pack();
		
		I.setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == AddEntry) {
			int ID = Integer.parseInt(JOptionPane.showInputDialog("Enter ID Number:"));
			String name = JOptionPane.showInputDialog("Enter Name:");
			list.put(ID, name);
		} else if (e.getSource() == search) {
			int ID = Integer.parseInt(JOptionPane.showInputDialog("Enter ID Number:"));
			if(list.containsValue(list.get(ID))) {
				System.out.println(list.get(ID));
			}else {
				System.out.println("Does not exist");
			}
		} else if (e.getSource() == ViewList) {
			for(Integer s : list.keySet()){
				System.out.println("ID: " + s + " Name: " + list.get(s));
			}
		} else if (e.getSource() == RemoveEntry) {
			int ID = Integer.parseInt(JOptionPane.showInputDialog("Enter ID Number:"));
			if (list.containsKey(ID)) {
				list.remove(ID);
			}else {
				System.out.println("Does not exist");
			}
		}
	}
	
}
