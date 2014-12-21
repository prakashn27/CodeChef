import java.util.*;
import java.math.BigInteger;

class LPRIME {
	//BigInteger start = BigInteger.TEN;
	//BigInteger end = BigInteger.TEN;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0; // count the numer of values
		/*BigInteger n = new BigInteger();
		
		n.valueOf(sc.nextLong());
		start.pow((n-1).intValue()); // starting value
		end.pow((n).intValue()); //use < since for n=2 ; end =100; we have to cehck till 99 only
		*/
		// brute force:
		// check every possible number within the range
		// check the isPossiblePrime condition
		// in that list check if the number is NOT divisible
		// by 2,3,5,7,11,47
		// calculate the permutaion of 1,2,3,5,7 with the number of digits and applying the 
		//divisibility rule to check it. LESS time than brute force.
		int n = sc.nextInt();
		LPRIME program = new LPRIME();
		Permutations gen = new Permutations("12357", n);
		List<String> v = gen.getVariations();

		for (String s : v) {
		    if (program.isPossiblePrime(s)) {
		    	count = count + 1;
		    }
		}
		System.out.println(count%9973);

	}

	private Boolean isPossiblePrime(String str) {
		//check to see if it is divisible by 2,3,5,7,11,47
		//String strnum = num.toString();
		//int numinList = Integer.parseInt(str);
		//STILL I GET INDEX MEMORY OUT OF BOUND
		//long numinList = Long.parseLong(str); //long implementation
		BigInteger BInum = new BigInteger(str);
		if(BInum.remainder(BigInteger.valueOf(2)).equals(BigInteger.ZERO))
			return false;
		if(BInum.remainder(BigInteger.valueOf(3)).equals(BigInteger.ZERO))
			return false;
		if(BInum.remainder(BigInteger.valueOf(5)).equals(BigInteger.ZERO))
			return false;
		if(BInum.remainder(BigInteger.valueOf(7)).equals(BigInteger.ZERO))
			return false;
		if(BInum.remainder(BigInteger.valueOf(11)).equals(BigInteger.ZERO))
			return false;
		if(BInum.remainder(BigInteger.valueOf(47)).equals(BigInteger.ZERO))
			return false;
		return true;
		/*
		if((numinList%2) == 0) {
			return false;
		}
		if((numinList%3) == 0) {
			return false;
		}
		if((numinList%5) == 0) {
			return false;
		}
		if((numinList%7) == 0) {
			return false;
		}
		if((numinList%11) == 0) {
			return false;
		}
		if((numinList%47) == 0) {
			return false;
		}
		return true;
		*/
	}
}
class Permutations  {  //PermutationsWithRepetition

	private String a;
	private int n;
	public Permutations(String a, int n) {
		this.a = a;
		this.n = n;
	}

	public List<String> getVariations() {
		int l = a.length();
		int permutations = (int) Math.pow(l, n);
		char[][] table = new char[permutations][n];
		//fill 
		for (int x = 0; x < n; x++) {
		    int t2 = (int) Math.pow(l, x);
		    for (int p1 = 0; p1 < permutations;) {
		        for (int al = 0; al < l; al++) {
		            for (int p2 = 0; p2 < t2; p2++) {
		                table[p1][x] = a.charAt(al);
		                p1++;
		            }
		        }
		    }
		}
		//read 
		List<String> result = new ArrayList<String>();
		for (char[] permutation : table) {
		    result.add(new String(permutation));
		}
		return result;
	}
	/*
	public int getPrimeCount() {
		int l = a.length();
		int permutations = (int) Math.pow(l, n);
		char[][] table = new char[permutations][n];
		//fill 
		for (int x = 0; x < n; x++) {
		    int t2 = (int) Math.pow(l, x);
		    for (int p1 = 0; p1 < permutations;) {
		        for (int al = 0; al < l; al++) {
		            for (int p2 = 0; p2 < t2; p2++) {
		                table[p1][x] = a.charAt(al);
		                p1++;
		            }
		        }
		    }
		}
		//read 
		List<String> result = new ArrayList<String>();
		for (char[] permutation : table) {
		    result.add(new String(permutation));
		}
		return result;
	}
	*/
}
