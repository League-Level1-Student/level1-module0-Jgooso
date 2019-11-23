package _07_fortune_cookie;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
public class fortuneCookie implements ActionListener {
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
	    frame.add(button);
	    frame.pack();
	    button.addActionListener(this);
        System.out.println("Button clicked");
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showConfirmDialog(null, "Woohoo");
		int ran = new Random().nextInt(5);
		if(ran == 0) {
			JOptionPane.showConfirmDialog(null, "You will die eventually!");
		} else if(ran == 1) {
			JOptionPane.showConfirmDialog(null, "You will die eventually!!");
		} else if(ran == 2) {
			JOptionPane.showConfirmDialog(null, "You will die eventually!!!");
		} else if(ran == 3) {
			JOptionPane.showConfirmDialog(null, "You will die eventually!!!!");
		} else if(ran == 4) {
			JOptionPane.showConfirmDialog(null, "You will die eventually!!!!!");
		} 
	}
}
