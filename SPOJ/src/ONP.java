import java.util.*;
import java.lang.*;

public class ONP {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();	//skip the remainig part of the line
		while(t-- > 0) {
			String l = in.nextLine();
			StringBuilder res = new StringBuilder();
			Stack<Character> operands = new Stack<Character>();
			Stack<Character> symbols = new Stack<Character>();
			Character temp;
			for(int i = 0; i < l.length(); i++) {
				temp = l.charAt(i);
				if(temp == '(') {
					continue;
				}
				else if(temp == ')') {
//					System.out.println(symbols);
					res.append(symbols.pop());
				}
				else if(temp == '+' || temp == '-' || temp == '*' || temp == '/' || temp == '^'){
					symbols.push(temp);
				}
				else {
					res.append(temp);
				}
			}
			System.out.println(res.toString());
		}
	}

}
