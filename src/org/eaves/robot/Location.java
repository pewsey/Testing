package org.eaves.robot;

public class Location {

	private int _x;
	private int _y;
	private Direction _direction;

	public Location(int x, int y, Direction direction) {
		_x = x;
		_y = y;
		_direction = direction;
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + _x;
		result = 31 * result + _y;
		result = 31 * result + _direction.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
