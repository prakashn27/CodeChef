import java.io.*;
import java.math.BigInteger;
import java.util.*;
class PALIN {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*String p = "level";
		if(checkPalindrome(p)) System.out.println("yes");
		else System.out.println("no");
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases = Integer.parseInt(br.readLine());
		List<BigInteger> ResultList = new ArrayList<BigInteger>(noOfTestCases);
		while(noOfTestCases != 0) {
			BigInteger result;
			int i,j, indexI, indexJ;
			String inp = br.readLine();
			Long longInp = Long.parseLong(inp); //to remove the preceding zeros
			BigInteger BigInp = BigInteger.valueOf(longInp);
			inp = Long.toString(longInp);
			int l = inp.length();
			char[] dst = new char[l];
			inp.getChars(0, l, dst, 0);
			//System.out.println(dst);
			if((l % 2) == 0) { //for even i,j are different places
				i = l/2 - 1; // since array starts by 0 to index correctly we subtract by 1
				j = l/2 ;
				indexI = i;
				indexJ = j;
			}
			else { 		//for odd i and j are same
				i = (l)/2;
				j = i;
				indexI = indexJ = j = i;
			}
			//System.out.println(inp);
			//System.out.println(l +"i=" +indexI + "j=" + indexJ + "inp[i]" + inp.charAt(i) + inp.charAt(j));
			//case 1: checking if i/p is palindrome
			// then add +1 to the middle
			
			if(allAre9(dst,l)) {
				//System.out.println("check");
				result = BigInp.add(BigInteger.ONE).add(BigInteger.ONE);
				ResultList.add(result);
			}
			else if(checkPalindrome(inp)) {
				if(l%2 == 0){ //even
					int iPower = l - 1 - i; 
					int jPower = l - 1 - j;
					result = BigInp.add(BigInteger.TEN.pow(iPower)).add(BigInteger.TEN.pow(jPower));
					//System.out.println(result + "  " + iPower + "   " + jPower);
					ResultList.add(result);
				}
				else{
					int oddPower = l - 1 - i;//since i and j are equal
					result = BigInp.add(BigInteger.TEN.pow(oddPower));
					//System.out.println(result + "  " + oddPower);
				}
			}
			else{ //case 2: if left and right are not same
				//System.out.println("check");
				while((inp.charAt(indexI) == inp.charAt(indexJ)) && (indexI >= 0) && (indexJ < l)) {
					indexI--;
					indexJ++;
				}
				String copyInp = inp;
				//System.out.println(indexI + "  " + indexJ);
				
				//copy left side to right side
				String reverse = new StringBuilder(copyInp).reverse().toString();
				//System.out.println("original   "+copyInp +"reverse :" + reverse );
				copyInp = copyInp.substring(0, indexJ) + reverse.substring(indexJ);
				//System.out.println(copyInp);
				//case 2.1: if leftside is greater than right side
				long longCopyInp = Long.parseLong(copyInp);
				BigInteger bigCopyInp = BigInteger.valueOf(longCopyInp);
				if(bigCopyInp.compareTo(BigInp) == 1) {
					ResultList.add(bigCopyInp);
				}
				else {
					if(l%2 == 0){ //even
						int iPower = l - 1 - i; 
						int jPower = l - 1 - j;
						result = bigCopyInp.add(BigInteger.TEN.pow(iPower)).add(BigInteger.TEN.pow(jPower));
						//System.out.println(result + "  " + iPower + "   " + jPower);
						ResultList.add(result);
					}
					else{
						int oddPower = l - 1 - i;//since i and j are equal
						result = bigCopyInp.add(BigInteger.TEN.pow(oddPower));
						//System.out.println(result + "  " + oddPower);
					}
				}
			}
			noOfTestCases--;
		}
		Iterator<BigInteger> itr = ResultList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		

	}
	//check and return true if palindrome
	public static Boolean checkPalindrome(String Palin) {
		String reverse = "";
		int length = Palin.length();
		for( int i = length - 1; i >= 0; i-- )
			reverse = reverse + Palin.charAt(i);
		if(Palin.equals(reverse)) return true;
		else return false;
	}
	 //to check all the input is 9
	static Boolean allAre9(char[] dst, int l){
	for( int k = 0; k < l; k++){
		//System.out.print(dst[k]);
		if(dst[k] != '9' )
			return false;
	}
	return true;
	}

}
