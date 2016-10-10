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
			int b = in.nextInt();
			for(int i = a; i <= b; i++) {
				if(isPrime(i)) {
					System.out.println(i);
				}
			}
			//in.nextLine();
			System.out.println();	//empty line
		}
	}

	public static Boolean isPrime(int a) {
		if(a == 1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(a); i++) {
			if(a % i == 0) {
				return false;
			}
			// System.out.println("test" + i);
		}
		return true;
	}
}