
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
	int l = 0, t = 0;
	double p = 0.0;
	public int monthlyPayment(int loan, int interest, int term)
	{
		l = loan;
		p = interest/10.0; 
		t = term;
		int low = 0, high = l, mid = 0, val;
		for(int i = 0; i < 50; i++) {
			mid = (int)(low + high) / 2;
			val = calculate(mid, loan);
			if(val == 0) return mid;
			else if(val > 0) low = mid;
			else high = mid;
		}
		return mid;
	}
	private int calculate(int amt, int _loan) {
		System.out.println(amt);
		int j;
		for(j = t*12; j > 1; j--) {
			_loan = _loan - amt;
			if(_loan <= 0) break;
			_loan = (int) Math.ceil(interestAccuring(_loan));
			if(_loan <= 0) break;
		}
		System.out.println("loan remaining " + _loan + " term remaining " + j);
		if(_loan == 0 && j ==  1) return 0;
		else if(_loan > 0 && j == 1) return 1;
		else return -1;
	}

	private double interestAccuring(int loan) {
		return loan * (1 + p/1200);
	}


	public static void main(String[] args) {
		Mortgage pgm = new Mortgage();
		System.out.println(pgm.monthlyPayment(1000, 50, 1));
	}
}

