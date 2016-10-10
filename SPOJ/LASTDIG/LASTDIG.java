import java.util.*;

public class LASTDIG {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //gets the number
		sc.nextLine();	// line 
		List<Integer> ResultList = new ArrayList<Integer>();
		while(n != 0){
			String line = sc.nextLine();
			String[] Nums = line.split("\\s+");
			int base = Integer.parseInt(Nums[0]);
			long exp = (long)Integer.parseInt(Nums[1]);
			int tempResult = lastDigit(base,exp);
			ResultList.add(tempResult);
			n--;
		}
		sc.close();
		Iterator<Integer> itr = ResultList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public static int lastDigit(int base, long exp) 
	{
		if(exp < 0) {
			return 0;
		}
		if(exp == 0) {
			return 1;
		}
		if(base == 10 || base ==20){
			return 0;
		}
		if(base == 5 || base == 15) {
			return 5;
		}
		if(base == 6 || base == 16) {
			return 6;
		}
		if(base == 1 || base == 11){
			return 1;
		}
		Integer[] v2 = {6,2,4,8};
		Integer[] v3 = {1,3,9,7};
		Integer[] v4 = {6,4,6,4};
		Integer[] v7 = {1,7,9,3};
		Integer[] v8 = {6,8,4,2};
		Integer[] v9 = {1,9,1,9};
		int ReducedExp = (int)exp % 4;
		switch(base){
		case 2:
		case 12:
			return v2[ReducedExp];
		case 3:
		case 13:
			return v3[ReducedExp];
		case 4:
		case 14:
			return v4[ReducedExp];
		case 7:
		case 17:
			return v7[ReducedExp];
		case 8:
		case 18:
			return v8[ReducedExp];
		case 9:
		case 19:
			return v9[ReducedExp];
		}
		return 0;
	}
}
	
