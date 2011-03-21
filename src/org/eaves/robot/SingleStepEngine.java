package org.eaves.robot;

public class SingleStepEngine implements Engine {

	public static final int STEP_SIZE = 1;
	@Override
	public Location move(Location current) {
		return current.evaluate(STEP_SIZE);
	}

}
