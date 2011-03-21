package org.eaves.robot;

public interface Robot {

	void place(Location location);

	void move();

	void left();

	void right();

	Location currentLocation();

}
