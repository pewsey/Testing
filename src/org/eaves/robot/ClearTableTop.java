package org.eaves.robot;

public class ClearTableTop implements TableTop {

	private int _maxX;
	private int _maxY;

	public ClearTableTop(int x, int y) {
		_maxX = x;
		_maxY = y;
	}

	@Override
	public boolean isValidLocation(Location location) {
		return inRange(_maxX, location.getX()) && inRange(_maxY, location.getY());
	}

	private static boolean inRange(int maxValue, int value) {
		return (value >= 0 && value <= maxValue);
	}

}
