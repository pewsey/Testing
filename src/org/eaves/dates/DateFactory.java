package org.eaves.dates;

import java.util.StringTokenizer;

public class DateFactory {
	private static int MIN_YEAR = 1900;
	private static int MAX_YEAR = 2100;

	/* expects the format
	 *  DD MM YYYY
	 */
	public Date createDate(String dateRepresentation) {
		StringTokenizer tokens = new StringTokenizer(dateRepresentation);
		if (tokens.countTokens() != 3) {
			throw new IllegalArgumentException("Yo! Your string is bad ["+ dateRepresentation + "]");
		}
		String dayString = tokens.nextToken();
		String monthString = tokens.nextToken();
		String yearString = tokens.nextToken();
		
		try {
			return createDate(Integer.parseInt(dayString), 
								Integer.parseInt(monthString), Integer.parseInt(yearString));
		}
		catch (NumberFormatException urk)
		{
			throw new IllegalArgumentException("Yo! Learn to use sensible numbers in your dates");
		}
	}
	
	public Date createDate(int day, int month, int year) {
		Validator validYear = new RangeValidator(year, MIN_YEAR, MAX_YEAR);
		Validator validDayForMonth = new DayForMonthValidator(day, month, year);
		
		if (validYear.isValid() && validDayForMonth.isValid()) {
			return new Date(day, month, year);
		}
		throw new IllegalArgumentException("Yo! Your inputs are not good");
	}

}
