package org.eaves.dates;

import junit.framework.TestCase;


public class TestDates extends TestCase {
	
	public void testDateCreation() {
		Date d = new Date(10,01,2011);
		assertNotNull(d);
	}
	
	public void testDateCompareSame() {
		Date d1 = new Date(10, 01, 2011);
		Date d2 = new Date(10, 01, 2011);
		assertTrue(d1.equals(d1));
		assertTrue(d2.equals(d2));
		assertTrue(d1.equals(d2));
	}
	
	public void testDateCompareDifferent() {
		Date d1 = new Date(10, 01, 2011);
		Date d2 = new Date(11, 01, 2011);
		Date d3 = new Date(10, 02, 2011);
		Date d4 = new Date(10, 01, 2012);
		
		assertFalse(d1.equals(new String("foo")));
		assertTrue(d1.equals(d1));
		assertFalse(d1.equals(d2));
		assertFalse(d1.equals(d3));
		assertFalse(d1.equals(d4));
	}
	
	public void testDateDelta() {
		Date d1 = new Date(10, 01, 2011);
		Date d2 = new Date(11, 01, 2011);
		
		assertEquals(d1.delta(d1), 0);
		assertEquals(d1.delta(d2), -1);
		assertEquals(d2.delta(d1), 1);
	}
	
	public void testDates() {
		Date d1 = new Date(10, 01, 2011);
		Date d2 = new Date(10, 02, 2011);
		
		assertEquals(d2.delta(d1), 31);
		d2 = new Date(10, 01, 2012);
		
		assertEquals(d2.delta(d1), 365);
	}
	
	public void testALeapYear() {
		Date d1 = new Date(01, 02, 2012);
		Date d2 = new Date(01, 03, 2012);
		
		assertEquals(d2.delta(d1), 29);
		
		d2 = new Date(01, 02, 2013);
		
		assertEquals(d2.delta(d1), 366);
	}
	
}
