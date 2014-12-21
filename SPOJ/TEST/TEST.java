package SPOJ;
import java.util.*;

public class TEST {

	public static void main(String[] args) {
		List<Integer> test = new ArrayList<Integer>();
		int i;
		
		try {
			Scanner sc = new Scanner(System.in);
		
		while ((i = sc.nextInt()) != 42) {
			test.add(i);
		}
		}
		catch(Exception e) {
			return;
		}
		Iterator<Integer> li = test.iterator();

		while (li.hasNext()) {
			System.out.println(li.next());
		}

	}

}
