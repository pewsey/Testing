package org.eaves.robot;

public class Location {

	private int _x;
	private int _y;

	public Location(int x, int y) {
		_x = x;
		_y = y;
	}

	public int getX() {
		return _x;
	}
	
	public int getY() {
		return _y;
	}
	
	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + _x;
		result = 31 * result + _y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ( !(obj instanceof Location)) {
			return false;
		}
		Location that = (Location)obj;
		return (_x == that.getX()) && (_y == that.getY());
	}

	@Override
	public String toString() {
		return _x + ", " + _y;
	}
}
