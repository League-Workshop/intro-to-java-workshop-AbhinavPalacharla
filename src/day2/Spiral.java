package day2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		
		Robot walle = new Robot();
		
		// 5. Set your robot's pen to the down position
		walle.penDown();
		// 3. Set the robot to go at max speed (10)
		walle.setSpeed(100);
		// 4. Do the following (steps 6-8) 75 times
		for (int j = 0; j < 1000000; j++) {
			
		
			// 7. Change the pen color to random
		walle.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
			walle.move(5*j);
			// 2. Turn the robot 1/7 of 360 degrees to the right
		walle.turn(360/7);
			// 8. Set the pen width to i
			walle.setPenWidth(j);}
	}
}
