package org.eaves.robot;

public interface Robot {

	void move();

	void left();

	void right();

	boolean place(Location location, Direction facing);

	boolean isLocated(Location location);
	boolean isFacing(Direction facing);
}
