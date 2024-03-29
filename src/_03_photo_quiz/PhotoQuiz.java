package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String image = "https://image.shutterstock.com/image-photo/bright-spring-view-cameo-island-260nw-1048185397.jpg";
		// 2. create a variable of type "Component" that will hold your image
			Component images = createImage(image);
			images.setVisible(true);
		// 3. use the "createImage()" method below to initialize your Component
		// 4. add the image to the quiz window
			quizWindow.add(images);
		// 5. call the pack() method on the quiz window
			quizWindow.pack();
		// 6. ask a question that relates to the image
			String answer = JOptionPane.showInputDialog(null, "Is there water in this image?");
		// 7. print "CORRECT" if the user gave the right answer
			if(answer.equals("yes")) {
				JOptionPane.showConfirmDialog(null, "Correct");
			}else if(answer.equals("no")) {
				JOptionPane.showConfirmDialog(null, "Incorrect");
			}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
			quizWindow.remove(images);
		// 10. find another image and create it (might take more than one line
		// of code)
			String image2 = "https://images.unsplash.com/photo-1499084732479-de2c02d45fcc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80";
		// 11. add the second image to the quiz window
			images = createImage(image2);
			quizWindow.add(images);
		// 12. pack the quiz window
			quizWindow.pack();
		// 13. ask another question
			answer = JOptionPane.showInputDialog(null, "Is there a man in this image?");
			
				if(answer.equals("yes")) {
					JOptionPane.showConfirmDialog(null, "Correct");
				}else if(answer.equals("no")) {
					JOptionPane.showConfirmDialog(null, "Incorrect");
				}
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
