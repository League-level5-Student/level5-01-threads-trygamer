package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded implements  Runnable {
	
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {
	OlympicRings_Threaded[] olmpr = new OlympicRings_Threaded[5];

	
}

Thread t;




	public  OlympicRings_Threaded() {
		// TODO Auto-generated method stub
		
	 t =new Thread();
	t.start(); 
	
		
	}






	@Override
	public void run() {
		// TODO Auto-generated method stub
		Robot r= new Robot();
		for(int i =0;i<360;i++) {
			r.move(1);
			r.move(1);
			
		}
	}









	





	
}

