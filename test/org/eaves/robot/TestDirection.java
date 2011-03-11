package org.eaves.robot;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestDirection {
    
    @Test
    public void testCreateNorth()
    {
        Direction north = Direction.valueOf("NORTH");
        assertEquals(Direction.NORTH, north);
    }
    
    @Test
    public void testCreateSouth()
    {
        Direction south = Direction.valueOf("SOUTH");
        assertEquals(Direction.SOUTH, south);
    }
    
    @Test
    public void testLeftFromNorth()
    {
        Direction north = Direction.NORTH;
        assertEquals(Direction.WEST, north.left());
    }
    
    @Test
    public void testRightFromWest()
    {
        Direction west = Direction.WEST;
        assertEquals(Direction.NORTH, west.right());
    }

}
