import java.io.*;
import java.math.BigInteger;
import java.util.*;

class CANDY3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long noOfCases = Long.parseLong(br.readLine());
		List<String> resultList = new ArrayList<String>();
		while (noOfCases != 0) {
			br.readLine();
			String stud = br.readLine();
			long noOfStud = Long.parseLong(stud);
			BigInteger BIstud = new BigInteger(stud);
			if(noOfStud != 0) {
				long tempNoOfStud = noOfStud;
				BigInteger totalCandy = BigInteger.ZERO;
				while (tempNoOfStud != 0) {
					String strCandy = br.readLine();
					BigInteger tempCandy = new BigInteger(strCandy);
					totalCandy = totalCandy.add(tempCandy);
					tempNoOfStud--;
				}
				if (totalCandy.mod(BIstud).equals(BigInteger.ZERO)) {
					resultList.add("YES");
				} else {
					resultList.add("NO");
				}
			}
			noOfCases--;
		}
		Iterator<String> itr = resultList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
