package _08_jack_in_the_box;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JApplet;


public class jackInTheBox implements ActionListener{
	static JFrame frame = new JFrame();
	static jackInTheBox jack = new jackInTheBox();
	int i = 0;
	static JButton button = new JButton();
	
	
	public static void main(String[] args) {
		jack.run();
		
	}
	public void run() {
		frame.setVisible(true);
		frame.pack();
		button.addActionListener(this);
		frame.add(button);
	}
	
	private void showPicture(String fileName) { 
	     try {
	          JLabel imageLabel = createLabelImage(fileName);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
	private JLabel createLabelImage(String fileName) {
	     try {
	          java.net.URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileName);
	          return new JLabel();
	     }
	}

	//3. Also play a sound when the jack-in-the-box pops up using this method.
	//(A sample sound homer-woohoo.wav is provided in the default package)
	private void playSound(String soundFile) { 
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	public void actionPerformed(ActionEvent arg0) {
		//JButton buttonPressed = (JButton) arg0.getSource();
		
		i+=1;
		System.out.println(i);
		if(i == 5) {
		jack.showPicture("jackInTheBox.png");
		jack.playSound("homer-woohoo.wav");
		}
		
		
	}	
}
