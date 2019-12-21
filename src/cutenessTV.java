import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener{
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	JButton buttonDuck = new JButton();
	JButton buttonFrog = new JButton();
	JButton buttonUnicorn = new JButton();
	
public void run() {
	
	frame.add(panel);
	panel.add(buttonUnicorn);
	panel.add(buttonFrog);
	panel.add(buttonDuck);
	buttonDuck.addActionListener(this);
	buttonFrog.addActionListener(this);
	buttonUnicorn.addActionListener(this);
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed.equals(buttonDuck)) {
		showDucks();
	}else if(buttonPressed.equals(buttonFrog)) {
	showFrog();
	}else if(buttonPressed.equals(buttonUnicorn)) {
		showFluffyUnicorns();
	}
	}
void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
}
