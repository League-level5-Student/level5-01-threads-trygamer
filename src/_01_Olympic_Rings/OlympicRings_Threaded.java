package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded implements  Runnable {
	

	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	Robot[] r = new Robot[5];
	public static void main(String[] args) {
	
		for(int i=0 ; i<5;i++) {
			
			
			
		}
		
		Robot c = new Robot();
		c.penDown();
		for(int i=0; i<360;i++) {
			
			
			
		}
		
		
	}
	
	
	



	public void run(Robot c) {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void run() {
		// TODO Auto-generated method stub
		r.move(1);
		r.turn(1);
	}
}

