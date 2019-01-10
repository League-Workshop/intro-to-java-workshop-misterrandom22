package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		// 1. Create a new Robot
Robot hal = new Robot();
hal.hide();
hal.setX(650);
hal.setY(350);
		// 3. Put the robot's pen down
hal.penDown();
		// 8. Make the robot go at maximum speed (100)
hal.setSpeed(100);
		// 9. Set the pen to a color that you like for the shape
hal.setRandomPenColor();
		// 4. Make a variable for the number of sides you want (can’t test this one)
int sides=5;
		// 5. Make a second variable for the angle you want the robot to turn. Hint: you can divide in Java using "/". Can’t test until step 6
int angle=360/sides;
		// 7. Use a for loop to repeat steps #2 to #11, 200 times. When this is done you should see a pentagon
for(int i=0;1<5;i++) {
	hal.setRandomPenColor();
			// 2. Move the robot 200 pixels
	
			// 10. Change the previous line of code to make the robot move "i" pixels instead of 200 
	hal.move(i);
			// 6. Turn the robot the amount in your angle variable
	hal.turn(angle);
			// 11. Turn the robot one more degree
	hal.turn(1);
	}}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}
