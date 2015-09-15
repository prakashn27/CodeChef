import java.util.*;
import java.lang.*;
/*
Sample input: 

3
24 1
4358 754
305 794

Sample output:

34
1998
1
*/
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		in.nextLine();	//skip the remainig part of the line
		while(in.hasNext()) {
			String nums = in.nextLine();
			String[] num = nums.split(" "); //seperated by space
			int a = reverse(num[0]);
			int b = reverse(num[1]);
			System.out.println(reverse(Integer.toString(a+b)));
		}
		
	}
	
	public static int reverse(String n) {
		StringBuilder sb = new StringBuilder(n);
		return Integer.parseInt(sb.reverse().toString());
	}
}
