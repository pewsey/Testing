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
		
		_robot.place(new Location(0,0, Direction.valueOf("NORTH")));
	}
		
	@Test
	public void testCreateEnvironment()
	{
		assertEquals(new Location(0,0, Direction.valueOf("NORTH")), _comparable.getCurrentLocation());
	}
	
	@Test
	public void testMove() {
		_robot.move();
		assertEquals(new Location(0,1, Direction.valueOf("NORTH")), _comparable.getCurrentLocation());
	}
	
	@Test
	public void testTurnLeft() {
		_robot.left();
		assertEquals(new Location(0,0, Direction.valueOf("WEST")), _comparable.getCurrentLocation());
	}
	
	@Test
	public void testTurnRight() {
		_robot.right();
		assertEquals(new Location(0,1, Direction.valueOf("EAST")), _comparable.getCurrentLocation());
	}
}
