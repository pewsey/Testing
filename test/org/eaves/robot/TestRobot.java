package org.eaves.robot;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class TestRobot {

	private Robot _robot;
	private Observer _comparable;

	@Before
	public void setUp() throws Exception {
		TableTop table = new ClearTableTop(5,5);
		Engine engine = new SingleStepEngine();
		_robot = new NoFallRobot(engine, table);
		
		_comparable = new LocationOuputObserver(_robot);
		
		_robot.place(new Location(0,0, Direction.fromString("N")));
	}
		
	@Test
	public void testCreateEnvironment()
	{
		assertEquals(new Location(0,0, Direction.fromString("N")), _comparable.getCurrentLocation());
	}
	
	@Test
	public void testMove() {
		_robot.move();
		assertEquals(_comparable.getCurrentLocation(), new Location(0,1, Direction.fromString("N")));
	}
	
	@Test
	public void testTurnLeft() {
		_robot.left();
		assertEquals(_comparable.getCurrentLocation(), new Location(0,0, Direction.fromString("W")));
	}
	
	@Test
	public void testTurnRight() {
		_robot.right();
		assertEquals(_comparable.getCurrentLocation(), new Location(0,1, Direction.fromString("E")));
	}
}
