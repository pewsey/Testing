package org.eaves.robot;

public class BasicRobotObserver implements RobotObserver {

	private Robot _robot;

	public BasicRobotObserver(Robot robot) {
		_robot = robot;
	}

	@Override
	public boolean matches(Robot robot) {
		return _robot.equals(robot);
	}

	@Override
	public boolean hasLocation(Location location) {
		return _robot.isLocated(location);
	}

	@Override
	public boolean hasFacing(Direction facing) {
		return _robot.isFacing(facing);
	}

}
