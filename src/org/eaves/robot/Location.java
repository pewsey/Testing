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

	private Direction getDirection() {
		return _direction;
	}

	public int getX() {
		return _x;
	}
	
	public int getY() {
		return _y;
	}
	
	public Location evaluate(int stepSize) {
		return new Location(_x+_direction.xDeltaForward(), _y+_direction.yDeltaForward(), _direction);
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
		if (this == obj) {
			return true;
		}
		if ( !(obj instanceof Location)) {
			return false;
		}
		Location that = (Location)obj;
		return ((_x == that.getX()) && (_y == that.getY()) && (_direction == that.getDirection()));
	}

	@Override
	public String toString() {
		return _x + ", " + _y + " - " + _direction;
	}

}
