package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	JFrame pride = new JFrame("I hate jay frame");
	JPanel greed = new JPanel();
	JButton sloth = new JButton("Surprise Me!!");
	static ArrayList<Song> songs = new ArrayList(); 
	Random random = new Random();
	
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		sloth.addActionListener(this);
		pride.add(greed);
		greed.add(sloth);

		pride.pack();
		pride.setVisible(true);
				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
		songs.add(new Song("batman.wav"));
		songs.add(new Song("demo.mp3"));
		songs.add(new Song("oof.mp3"));
	}
	public void actionPerformed(ActionEvent evt) {
		Object src = evt.getSource();
		if (src == sloth) {
			int i = random.nextInt(songs.size());
			songs.get(i).play();
			
		}
	}
}