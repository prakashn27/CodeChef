import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		in.nextLine();	//skip the remainig part of the line
		while(t-- > 0) {
			int value = in.nextInt();
			in.nextLine();
			System.out.println(z(value));
		}
	}
	static int z(int value) { 	//return the number of zeros at the end of the factorial
		int count = 0;
		for(int n = 5; n <= value; n *= 5) {
			count += value/n;
		}
		return count;
	}
}
