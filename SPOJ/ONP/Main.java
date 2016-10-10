import java.util.*;
import java.lang.*;

class Main
{
	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();	//skip the remainig part of the line
		while(t-- > 0) {
			String l = in.nextLine();
			StringBuilder res = new StringBuilder();
			Stack<Character> operands = new Stack<Character>();
			Stack<Character> symbols = new Stack<Character>();
			Character temp;
			for(int i = 0; i < l.length; i++) {
				temp = l.charAt(i);
				if(temp == '(') {
					continue;
				}
				else if(temp == ')') {
					res.append(symbols.pop());
				}
				else {
					res.append(temp);
				}
			}
			p(res.toString());
		}
	}
	public void p(Object o) { Systtem.out.println(o); }
}