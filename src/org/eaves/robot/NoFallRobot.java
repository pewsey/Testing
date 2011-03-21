package org.eaves.robot;

public class NoFallRobot implements Robot {

	private TableTop _table;
	private Location _location;
	private Engine _engine;

	public NoFallRobot(Engine engine, TableTop table) {
		_engine = engine;
		_table = table;
	}

	@Override
	public void place(Location location) {
		if (_table.isValidLocation(location)) {
			_location = location;
		}
	}

	@Override
	public void move() {
		Location potentialMove = _engine.move(_location);
		if (_table.isValidLocation(potentialMove)) {
			_location = potentialMove;
		}
	}

	@Override
	public void left() {
	}

	@Override
	public void right() {
	}

	@Override
	public Location currentLocation() {
		return _location;
	}

}
