
import stanford.karel.*;

public class InsideBorder extends SuperKarel {
	public void run() 
	
	{
		getInStartingPosition();
		for (int i = 0; i < 10; i++) {
			
			putBeepers();
			startNextRow();
		}
		
		backToStart();
	}
	
	private void getInStartingPosition() {
		move();
		turnLeft();
		
		turnRight();
	}
	
	private void putBeepers() {
		while (frontIsClear()) {
			move();
			if(noBeepersPresent()) {
				putBeeper();
			}
		}
	}	
		
	private void startNextRow() {	
		pickBeeper();
		turnAround();
		move();
		turnRight();
	}
	
	private void backToStart() {
		turnAround();
		move();
		turnAround();
	}
}