
// {{{ VimCoder 0.3.6 <-----------------------------------------------------
// vim:filetype=java:foldmethod=marker:foldmarker={{{,}}}

import static java.lang.Math.*;
import static java.math.BigInteger.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import java.math.*;
import java.util.*;

// }}}

public class SortEstimate
{
	double cc = 0.0;
	public double howMany(int c, int time)
	{
		double result = time / c;
		double i = 1;
		cc = c;
		while(calculateLhs(i) < time) {
			i *= 2;
		}
		System.out.println(i);
		double low = i/2, high = i, mid = 0.0;
		for(int j = 1; j < 50; j++) {
			mid = (low + high) / 2;
			System.out.println(j + ": low:" + low + " high:" + high + " mid:" + mid );
			if(calculateLhs(mid) < time) low = mid;
			else high = mid;
		}
		
		return mid;
	}
	private double calculateLhs(double i) {
		return cc * i * Math.log(i)/Math.log(2);
	}
}

