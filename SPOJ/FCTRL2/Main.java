import java.util.*;
import java.lang.*;
import java.math.BigInteger;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();	//skip the remainig part of the line
		while(t-- > 0) {
			int a = in.nextInt();
			BigInteger res = BigInteger.ONE;
			for(int i = 1; i <= a; i++) {
				res = res.multiply(BigInteger.valueOf(i));
			}
			System.out.println(res);	
		}
	}
}