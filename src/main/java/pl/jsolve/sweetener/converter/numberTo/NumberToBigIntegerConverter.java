package pl.jsolve.sweetener.converter.numberTo;

import java.math.BigInteger;

public class NumberToBigIntegerConverter extends NumberToAbstractConverter<BigInteger> {

	@Override
	public BigInteger convert(Number source) {
		return BigInteger.valueOf(source.intValue());
	}
}