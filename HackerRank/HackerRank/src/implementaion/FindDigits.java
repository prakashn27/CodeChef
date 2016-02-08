package implementaion;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		sc.nextLine();
		while(cnt-- > 0) {
			int a = sc.nextInt();
			String _a = String.valueOf(a);
//			System.out.println(_a);
			String s;
			Integer temp, result = 0;
			for(int i = 0; i < _a.length(); i++) {
				s = _a.substring(i, i+1);
				temp = Integer.parseInt(s);
//				System.out.println(temp);
				if(temp != 0 && a % temp == 0) {
					result++;
				}
			}
			System.out.println(result);
		}
		
		sc.close();

	}

}
