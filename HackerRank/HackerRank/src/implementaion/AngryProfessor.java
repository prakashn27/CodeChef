package implementaion;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt = in.nextInt();
		in.nextLine();
		while(cnt-- > 0) {
			int n = in.nextInt();
			int k = in.nextInt();
			in.nextLine();
			int temp;
			int total_students_attending = 0;
			while(n-- > 0) {
				temp = in.nextInt();
				if(temp <= 0) {
					total_students_attending++;
				}
			}
			if(total_students_attending >= k) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
			in.nextLine();
		}
		in.close();

	}

}
