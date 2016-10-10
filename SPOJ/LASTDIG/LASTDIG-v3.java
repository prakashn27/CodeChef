import java.util.*;
class LASTDIG { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		int n = sc.nextInt(); 
		int m = n;
		sc.nextLine();
		Integer[] Result =  new Integer[n];
		while (n != 0) {
			String line = sc.nextLine();
			String[] Nums = line.split("\\s+");
			Integer base = Integer.parseInt(Nums[0]);
			Integer exp = Integer.parseInt(Nums[1]);
			int c = 1, e = 0;
			while(e < exp) {
				e = e + 1;
				c = (base*c) % 10;
			}
			Result[i] = c;
			n--;
			i++;
		}
		sc.close();
		for ( i = 0; i < m; i++) {
			System.out.println(Result[i]);
		}
	}
}
