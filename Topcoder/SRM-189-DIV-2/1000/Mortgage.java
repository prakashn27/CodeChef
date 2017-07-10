
// {{{ VimCoder 0.3.6 <-----------------------------------------------------
// vim:filetype=java:foldmethod=marker:foldmarker={{{,}}}

import static java.lang.Math.*;
import static java.math.BigInteger.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import java.math.*;
import java.util.*;

// }}}

public class Mortgage
{
	public int monthlyPayment(int loan, int in, int term)
	{
		double interest = in/10.0;
		long low = 0, high = Integer.MAX_VALUE;
		long mid = 0, i = 0;
		while(low + 1 < high) {
			mid = (low + high) / 2;
			if(calculate(loan, mid, interest, term)) high = mid;
			else low = mid;
		}
		return (int)mid;
		
	}
	private boolean calculate(long loan, long monthly, double interest, int term) {
		System.out.println(monthly);
		int j;
		for(j = 0; j < term*12; j++) {
			loan = loan - monthly;
			if(loan <= 0) return true;
			loan = (int) Math.ceil(loan * (1 + interest/1200.0));
		}
		return false;
	}

	public static void main(String[] args) {
		Mortgage pgm = new Mortgage();
		System.out.println(pgm.monthlyPayment(1999999999, 1000000, 1));
	}
}

