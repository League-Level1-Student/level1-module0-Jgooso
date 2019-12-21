import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SensitiveKeyboard implements KeyListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
public void run() {
	frame.add(panel);
	frame.addKeyListener(this);
	frame.setVisible(true);
}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	speak("ouch");
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
static void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
         }
    }
}

