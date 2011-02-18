package org.eaves.dates;

public class Date {

	private int _day;
	private int _month;
	private int _year;
	
	private int _julianDay;
	private String _dateString;

	protected Date(int day, int month, int year) {
		_day = day;
		_month = month;
		_year = year;
		
		_dateString = String.format("%02d %02d %04d", day, month, year);
		
		int a = (14-_month) / 12;
		int y = _year + 4800 - a;
		int m = _month + 12*a - 3;
		_julianDay = _day + (153*m +2)/5 + 365*y + y/4 - y/100 + y/400 - 32405;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 17;
		result = prime * result + _julianDay;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Date other = (Date) obj;
		return (_julianDay == other._julianDay);
	}
	
	@Override
	public String toString()
	{
		return _dateString;
	}

	public int delta(Date otherDate) {
		return this._julianDay - otherDate._julianDay;
	}

}
