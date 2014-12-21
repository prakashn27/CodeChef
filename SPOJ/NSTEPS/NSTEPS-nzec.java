import java.util.Scanner;

class NSTEPS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total =  sc.nextInt();
		while(total >= 0){
			int x = sc.nextInt();
			int y = sc.nextInt();
			//System.out.println(x+"  :  "+y);
			if(x != y && y+2 != x) {
				System.out.println("No Number");
				continue;
			}
			if( y%2 == 0) {
				System.out.println(x+y);
			}
			else {
				System.out.println(x+y-1);
			}
			total--;
		}
		sc.close();
	}

}
