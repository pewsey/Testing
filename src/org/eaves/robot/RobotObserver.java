package org.eaves.robot;

public interface RobotObserver {
	
	boolean matches(Robot robot);
	boolean hasLocation(Location location);
	boolean hasFacing(Direction facing);
}
