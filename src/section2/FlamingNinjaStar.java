package section2;

import org.jointheleague.graphical.robot.Robot;

public class FlamingNinjaStar {
	
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms
		
		// 1. Make a new robot, and set it's pen down.
Robot bmo= new Robot();
bmo.hide();
		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		bmo.setX(650);
		bmo.setY(290);
		bmo.penDown();
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 12. Set the robot speed to 100
bmo.setSpeed(100);
		// 13. Use a for loop to repeat all of the code below 25 times
for(int i=0;1<25;i++) {
			// 2. Turn the robot 1/8 of a circle
		bmo.turn(360/8);
			// 3. Move the robot 64 pixels
bmo.move(64);
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
			bmo.turn(-40);
			// 5. Move the robot the distance in the variable flameSize
			bmo.move(200);
			// 6. Turn the robot 170 degrees
			bmo.turn(170);
			// 7. Move the robot the distance in the variable flameSize (again)
			bmo.move(200);
			// 8. Turn the robot 64 degrees to the right
			bmo.turn(64);
			// 9. Move the robot the distance in the variable baseSize
			bmo.move(baseSize);
			// 11. Color your ninja star like Figure 2.
		bmo.setPenColor(0, 0, 0);
}}}
	