package datastructures;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class JolluJumpers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t, a, b;
		Set<Integer> diffSet;
		Set<Integer> inpSet;
		while(in.hasNext()) {
			diffSet = new TreeSet<Integer>();
			inpSet = new TreeSet<Integer>();
			t = in.nextInt();
			a = in.nextInt();
			inpSet.add(a);
			t--;
			while(t-- != 0) {
				b = in.nextInt();
				inpSet.add(b);
				diffSet.add(Math.abs(a - b));
				a = b;
			}
			if(inpSet.containsAll(diffSet)) {
				System.out.println("Jolly");
			} else {
				System.out.println("Not Jolly");
			}
			
		}
		in.close();
	}

}
