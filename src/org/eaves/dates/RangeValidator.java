package org.eaves.dates;

public class RangeValidator implements Validator {

	private int _min;
	private int _max;
	private int _value;

	public RangeValidator(int value, int min, int max)
	{
		_value = value;
		_min = min;
		_max = max;
	}
	
	@Override
	public boolean isValid() {
		return ((_value <= _max) && (_value >= _min));
	}

}
