import java.util.*;

public class ADDREV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> ResultList = new ArrayList<Integer>(n);
		@SuppressWarnings("unused")
		String line1 = sc.nextLine();// for hidden blank space;
		while (n != 0) {
			String line = sc.nextLine();
			// System.out.println("number is" + n);
			// System.out.println(line);
			String[] Nums = line.split("\\s+");
			// reverse a string
			String RevNum0 = new StringBuilder(Nums[0]).reverse().toString();
			String RevNum1 = new StringBuilder(Nums[1]).reverse().toString();
			// converting into Integer
			int num0 = Integer.parseInt(RevNum0);
			int num1 = Integer.parseInt(RevNum1);
			// adding integer
			int result = num0 + num1;
			// Converting to String
			String Result = Integer.toString(result);
			// reversing and adding to arraylist
			 // to remove the front adding zeros
			String tempResult = new StringBuilder(Result).reverse().toString();
			int tempResultint = Integer.parseInt(tempResult);
			//ResultList.add(new StringBuilder(Result).reverse().toString());
			ResultList.add(tempResultint);
			// System.out.println(num0);
			// System.out.println(num1);

			n--;

		}
		sc.close();
		Iterator<Integer> itr = ResultList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
