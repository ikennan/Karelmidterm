import stanford.karel.*;

/*The citizenKarel subclass cleans out the chad from a ballot*/

public class citizenKarel extends SuperKarel {
	 
	public void run() {
	    while (frontIsClear()) {
	        move();
	        checkMiddleBeeper();
	        cleanExtraBeepers();
	        move();
	    }
	}
	private void checkMiddleBeeper() {
	    if (beepersPresent()) {
	        move();
	        move();
	    }
	}
	private void cleanExtraBeepers() {
	    if (noBeepersPresent()) {
	        cleanBeepersSouth();
	        cleanBeepersNorth();
	    }
	}
	/* Karel moves South, checks for beepers, and picks them up
	 * if there are any there.
	 */
	private void cleanBeepersSouth() {
	    turnRight();
	    move();
	    while (beepersPresent()) {
	        pickBeeper();
	    }
	    turnAround();
	    move();
	}
	/* Karel moves North, checks for beepers, and picks them up
	 * if there are any there.
	 */
	private void cleanBeepersNorth() {
	    move();
	    if (frontIsClear()) {
	        move();
	    }
	    while (beepersPresent()) {
	        pickBeeper();
	    }
	    turnAround();
	    move();
	    turnLeft();
	    }
	}

