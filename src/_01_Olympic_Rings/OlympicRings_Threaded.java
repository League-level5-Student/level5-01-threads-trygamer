package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	static Robot Robot_Blue = new Robot();
	static Robot Robot_Yellow = new Robot();
	static Robot Robot_Black = new Robot();
	static Robot Robot_Green = new Robot();
	static Robot Robot_Red = new Robot();
	
	Color c = new Color(0);
	
// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
    public static void main(String[] args) {
    	r_SetUp(Robot_Blue,000,500,Color.BLUE);
    	r_SetUp(Robot_Yellow,200,700,Color.YELLOW);
    	r_SetUp(Robot_Black,400,500,Color.BLACK);
    	r_SetUp(Robot_Green,600,700,Color.GREEN);
    	r_SetUp(Robot_Red,800,500,Color.RED);
    	action1();
    	
	} 
	
	
    
    

	public static void r_SetUp(Robot r, int locx, int locy, Color c) {
	
		r.moveTo(locx, locy);
		r.setPenColor(c);
		r.penDown();
}

	public static void action1() {
		
		Thread rb= new Thread(()->{
			for(int i = 0; i<360; i++) {
				Robot_Blue.move(1);
				Robot_Blue.turn(1);
			}
		});
		Thread rbk= new Thread(()->{
			for(int i = 0; i<360; i++) {
				Robot_Black.move(1);
				Robot_Black.turn(1);
			}
		});
		Thread ry= new Thread(()->{
			for(int i = 0; i<360; i++) {
				Robot_Yellow.move(1);
				Robot_Yellow.turn(1);
			}
		});
		Thread rr= new Thread(()->{
			for(int i = 0; i<360; i++) {
				Robot_Red.move(1);
				Robot_Red.turn(1);
			}
		});
		Thread rg= new Thread(()->{
			for(int i = 0; i<360; i++) {
				Robot_Green.move(1);
				Robot_Green.turn(1);
			}
		});
		rbk.start();

		rb.start();

		rg.start();

		rr.start();

		ry.start();


Robot_Blue.hide();
Robot_Red.hide();
Robot_Black.hide();
Robot_Yellow.hide();
Robot_Green.hide();

	}
	
	
	



}



