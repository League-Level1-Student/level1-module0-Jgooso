package _01_houses;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
//Fix Color
public class Houses {
	Robot rob = new Robot();
	public void run() {
		
		rob.setX(10);
		rob.setY(500);
		rob.penDown();
		rob.setSpeed(20);
		rob.hide();
		setHouse();
		
		
		//5. Use an if/else statement to set the pen color that the user requested
		
		
		
	}
	public void flatHouse(String height, String colour) {
		int iHeight = 250;
		/*
		if(height.equalsIgnoreCase("Small")) {
			iHeight = 60;
		} else if (height.equalsIgnoreCase("Medium")) {
			iHeight = 120;
		}else if (height.equalsIgnoreCase("Large")) {
			iHeight = 250;
		}
		*/
		
		rob.setAngle(0);
		
		rob.setPenColor(Color.decode(colour));
		rob.move(iHeight);
		rob.turn(90);
		rob.move(20);
		rob.turn(90);
		rob.move(iHeight);
		rob.turn(-90);
		rob.setPenColor(0,255,0);
		rob.move(10);
		
	}
	public void pointyHouse(String height, String colour) {
		int iHeight = 0;
		if(height.equalsIgnoreCase("Large")) {
			flatHouse("Large", colour);
		} else { 
			if (height.equalsIgnoreCase("Medium")) {
				iHeight = 120;
			}else if (height.equalsIgnoreCase("small")) {
				iHeight = 60;
			}
			rob.setAngle(0);
			System.out.println(colour);
			rob.setPenColor(Color.decode(colour));
			rob.move(iHeight);
			rob.turn(45);
			rob.move(10);
			rob.turn(90);
			rob.move(10);
			rob.turn(-45);
			rob.turn(90);
			rob.move(iHeight);
			rob.turn(-90);
			rob.setPenColor(0,255,0);
			rob.move(10);
		}
		
	}
	public void setHouse() {
		String colour = JOptionPane.showInputDialog(null, "What color do you want");
		String height = JOptionPane.showInputDialog(null,"What size house do you want: small,medium, or large");
		String color = null;
		if( colour.equals("red")) {
			color = "0xFF0000";
		}else if( colour.equals("orange")) {
			color = "0xFFBC00";
		}else if( colour.equals("yellow")) {
			color = "0xFFFF00";
		}else if( colour.equals("green")) {
			color = "0x00FF00";
		}else if( colour.equals("blue")) {
			color = "0x0000FF";
		}else if(colour.equals("purple")) {
			color = "0xFF00FF";
		}
		for(int i = 1; i < 11; i++) {
			pointyHouse(height, color);
		}
		
	}
}
