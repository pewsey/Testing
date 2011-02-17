package org.eaves.dates;

public class DayForMonthValidator implements Validator {

	private static int MAX_DAY[] = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30,
		31, 30, 31 };

	private int _day;
	private int _month;
	private int _year;
	
	public DayForMonthValidator(int day, int month, int year) {
		_day = day;
		_month = month;
		_year = year;
	}
	
	@Override
	public boolean isValid() {
		Validator range = new RangeValidator(_month, 1, 12);
		if (!range.isValid()) {
			return false;
		}
		int maxMonthDay = MAX_DAY[_month];
		if (_month == 2) {
			if (isLeapYear()) {
				maxMonthDay++;
			}
		}
		range = new RangeValidator(_day, 1, maxMonthDay);
		
		return range.isValid();
	}

	private boolean isLeapYear() {
		return ( (0 == _year % 4) && ((0 != _year % 100) || (0 == _year % 400)) );
	}

}
