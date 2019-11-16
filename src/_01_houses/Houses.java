package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;
//Fix Color
public class Houses {
	Robot rob = new Robot();
	public void run() {
		
		rob.setX(10);
		rob.setY(500);
		rob.penDown();
		rob.setSpeed(20);
		//rob.hide();
		for(int i = 1; i < 11; i++) {
			pointyHouse("Large", "RED");
		}
		
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
		
		rob.setPenColor(Color.getColor(colour, null));
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
			rob.setPenColor(Color.getColor("RED"));
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
}
