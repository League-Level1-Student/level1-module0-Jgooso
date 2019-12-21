
import org.jointheleague.graphical.robot.Robot;
public class Checkpoint {
	Robot robot = new Robot();
	void food(String fruit) {
	       System.out.println("I like " + fruit);
	}
	void truth(int x) {
	       if(x > 5)
	             System.out.println("Geeks rule");
	       else
	              System.out.println("Nerds rule");

	}
	void drawLine() {
		   robot.move(100);
	       robot.turn(90);
	}
	void jump(int height) {
	       if (height > 100)
	             System.out.println("The mouse jumped over the moon.");
	       if (height > 50)
	              System.out.println("The mouse jumped over the broom.");
	       if (height > 5)
	              System.out.println("The mouse jumped over the candlestick.");
	}
	void jump(String obstacle) {

        System.out.println("The mouse jumped over the " + obstacle);
 }
}
