package _09_sound_effects_machine;


import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundEffectMachine implements ActionListener{
	static JFrame frame = new JFrame();
	 static JPanel panel = new JPanel();
	 static JButton button1 = new JButton();
	 static JButton button2 = new JButton();
	 
 public void run() {
	 
	 frame.add(panel);
	 frame.setVisible(true);
	 panel.add(button1);
	 panel.add(button2);
	 frame.pack();
	 button1.addActionListener(this);
	 button2.addActionListener(this);
	 
	 
 }
 private void playSound(String fileName) {
     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
     sound.play();
}
 
@Override
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton)arg0.getSource();
	if(buttonPressed.equals(button1)) {
		playSound("sawing-wood-daniel_simon.wav");
	}else if(buttonPressed.equals(button2)) {
		playSound("homer-woohoo.wav");
	}
}


}
