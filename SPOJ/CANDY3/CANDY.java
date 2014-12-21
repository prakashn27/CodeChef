import java.util.*;
class CANDY3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfCases = sc.nextInt();
		sc.nextLine();
		while(noOfCases != 0) {
			int noOfStud = sc.nextInt();
			int tempNoOfStud = noOfStud;
			int totalCandy = 0;
			while(tempNoOfStud != 0) {
				int tempCandy = sc.nextInt();
				totalCandy = totalCandy + tempCandy;
				tempNoOfStud--;
			}
			if(totalCandy % noOfStud == 0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			noOfCases--;
			sc.nextLine();
		}
		sc.close();
		return;
	}

}
