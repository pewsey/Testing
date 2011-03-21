package org.eaves.robot;

public class NoFallRobot implements Robot {

	private TableTop _table;
	private Location _location;
	private Direction _facing;
	private Engine _engine;
	
	public NoFallRobot(Engine engine, TableTop table) {
		_engine = engine;
		_table = table;
	}

	@Override
	public boolean place(Location location, Direction facing) {
		if (_table.isValidLocation(location)) {
			_location = location;
			_facing = facing;
			return true;
		}
		return false;
	}

	@Override
	public void move() {
		Location potentialMove = _engine.move(_location, _facing);
		if (_table.isValidLocation(potentialMove)) {
			_location = potentialMove;
		}
	}

	@Override
	public void left() {
		_facing = _facing.left();
	}

	@Override
	public void right() {
		_facing = _facing.right();
	}

	@Override
	public boolean isLocated(Location location) {
		return _location.equals(location);
	}

	@Override
	public boolean isFacing(Direction facing) {
		return _facing.equals(facing);
	}
}
