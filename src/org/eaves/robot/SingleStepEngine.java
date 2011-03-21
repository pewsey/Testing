package org.eaves.robot;

public class SingleStepEngine implements Engine {

	public static final int STEP_SIZE = 1;
	
	@Override
	public Location move(Location current, Direction facing) {
		int x = current.getX();
		int y = current.getY();
		
		return new Location(x+facing.xDeltaForward()*STEP_SIZE, y+facing.yDeltaForward()*STEP_SIZE);
	}
}
