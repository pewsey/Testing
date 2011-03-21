package org.eaves.robot;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestRobot {

	private Robot _robot;
	private RobotObserver _current;

	@Before
	public void setUp() throws Exception {
		TableTop table = new ClearTableTop(5, 5);
		Engine engine = new SingleStepEngine();
		_robot = new NoFallRobot(engine, table);

		_current = new BasicRobotObserver(_robot);

		_robot.place(new Location(0, 0), Direction.valueOf("NORTH"));
	}

	@Test
	public void testCreateEnvironment() {
		assertTrue(_current.hasLocation(new Location(0, 0)));
		assertTrue(_current.hasFacing(Direction.valueOf("NORTH")));
	}

	@Test
	public void testMove() {
		_robot.move();
		assertTrue(_current.hasLocation(new Location(0, 1)));
		assertTrue(_current.hasFacing(Direction.valueOf("NORTH")));

	}

	@Test
	public void testTurnLeft() {
		_robot.left();
		assertTrue(_current.hasLocation(new Location(0, 0)));
		assertTrue(_current.hasFacing(Direction.valueOf("WEST")));
	}

	@Test
	public void testTurnRight() {
		_robot.right();
		assertTrue(_current.hasLocation(new Location(0, 0)));
		assertTrue(_current.hasFacing(Direction.valueOf("EAST")));
	}
}
