package org.eaves.dates;

import static junit.framework.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestDateFactory {

	private DateFactory _df;

	@Before
	public void setUp() {
		_df = new DateFactory();
	}

	@Test
	public void testCreateWithValid() {
		Date d = _df.createDate(10, 01, 2011);
		assertNotNull(d);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCreateWithInvalidDay() {
		_df.createDate(-1, 01, 2011);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCreateWithInvalidMonth() {
		_df.createDate(01, -1, 2011);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCreateWithInvalidYear() {
		_df.createDate(01, 03, 3000);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testNonLeapYearFebruary() {
		_df.createDate(29, 02, 2001);
	}

	@Test
	public void testLeapYearFebruary() {
		assertNotNull(_df.createDate(29, 02, 2004));
	}

	@Test
	public void testCreateDateFromString() {
		Date d1 = _df.createDate("18 09 1966");
		Date d2 = _df.createDate(18, 9, 1966);
		assertTrue(d1.equals(d2));

		d2 = _df.createDate(18, 10, 1966);
		assertFalse(d1.equals(d2));
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCreateDatesThatOnlyHaveOneArgument() {
		_df.createDate("xx");
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCreateDatesThatOnlyHaveTwoArguments() {
		_df.createDate("xxx yyy");
	}
	
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCreateDatesThatHaveThreeArgumentsButAreNotNumbers() {
		_df.createDate("xx yy zzzz");
	}
	
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testDateWithInvalidValue() {
		_df.createDate("55 12 1966");
	}
	
}
