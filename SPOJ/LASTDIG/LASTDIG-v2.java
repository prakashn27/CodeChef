import java.util.*;
import java.math.BigInteger;

public class LASTDIG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // gets the number
		sc.nextLine(); // line
		List<Integer> ResultList = new ArrayList<Integer>();
		while (n != 0) {
			String line = sc.nextLine();
			String[] Nums = line.split("\\s+");
			BigInteger base = new BigInteger(Nums[0]);
			BigInteger exp = new BigInteger(Nums[0]);
			BigInteger tempResult = newlastDigit(base, exp);
			ResultList.add(tempResult.intValue());
			n--;
		}
		sc.close();
		Iterator<Integer> itr = ResultList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static BigInteger newlastDigit(BigInteger base, BigInteger exponent) {
		return base.modPow(exponent, BigInteger.TEN);
	}
}
