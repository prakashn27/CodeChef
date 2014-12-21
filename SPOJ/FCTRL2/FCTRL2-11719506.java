import java.math.BigInteger;
import java.util.*;

class FCTRL2 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		int local= 0;
		List<Long> InputList = new ArrayList<Long>(n);
		List<BigInteger> ResultList = new ArrayList<BigInteger>(n);
		while (n != 0) {
			long inp =  sc.nextLong();
			//if (inp <= 100 && inp>=1) {
				InputList.add(inp);
				n--;
			//}
			//else System.out.println("Invalid Input: enter within [1,100]");
		}
		while(m != 0) {
			BigInteger ans = Factorial(InputList.get(local));
			ResultList.add(ans);
			m--;
			local++;
		}
		
		Iterator<BigInteger> itr = ResultList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	private static BigInteger Factorial(long f) {
		BigInteger result=  BigInteger.ONE;
		for(long i =   1; i <= f; i++){
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}

}
