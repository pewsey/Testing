package org.eaves.robot;

public class LocationOuputObserver implements Observer {

	private Robot _robot;

	public LocationOuputObserver(Robot robot) {
		_robot = robot;
	}

	@Override
	public Location getCurrentLocation() {
		return _robot.currentLocation();
	}

}
