import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();	//skip the remainig part of the line
		while(t-- > 0) {
			int a = in.nextInt();
			int res = 1;
			for(int i = 1; i <= a; i++) {
				res *= i;
			}
			//in.nextLine();
			System.out.println(res);	//empty line
		}
	}
}