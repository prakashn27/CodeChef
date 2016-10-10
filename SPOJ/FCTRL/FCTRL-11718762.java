import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FCTRL {

	public static void main(String[] args) {
//		long Integer d1=5,d2=25,d3=125,d4=625,d5=3125, d6=15625,
//			 	d7=78125,d8=390625,d9=1953125,d10=9765625,d11=48828125,d12=244140625,x;
//		Set<Integer> Dlist = new HashSet<Integer>();
//		
//		Dlist.add(5);
//		Dlist.add(25);
//		Dlist.add(125);
//		Dlist.add(625);
//		Dlist.add(3125);
//		Dlist.add(15625);
//		Dlist.add(78125);
//		Dlist.add(390625);
//		Dlist.add(1953125);
//		Dlist.add(9765625);
//		Dlist.add(48828125);
//		Dlist.add(244140625);
		//System.out.print(Dlist.size());
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		List<Integer> InputList = new ArrayList<Integer>(m);
		List<Integer> ResultList = new ArrayList<Integer>(m);
		//@SuppressWarnings("unused")
		//String unused = sc.nextLine();
		while(n != 0) {
			int i = sc.nextInt();
			InputList.add(i);
			n--;
		}
		int r = 0, i = 0, t;
		while(m != 0) {
			int temp = InputList.get(i);
			if(temp >= 5) {
				t =temp/5;
				r = r+t;
			}
			if(temp >= 25) {
				t =temp/25;
				r = r+t;
			}
			if(temp >= 125) {
				t =temp/125;
				r = r+t;
			}
			if(temp >= 625) {
				t =temp/625;
				r = r+t;
			}
			if(temp >= 3125) {
				t =temp/3125;
				r = r+t;
			}
			if(temp >= 15625) {
				t =temp/15625;
				r = r+t;
			}
			if(temp >= 78125) {
				t =temp/78125;
				r = r+t;
			}
			if(temp >= 390625) {
				t =temp/390625;
				r = r+t;
			}
			if(temp >= 1953125) {
				t =temp/1953125;
				r = r+t;
			}
			if(temp >= 9765625) {
				t =temp/9765625;
				r = r+t;
			}
			if(temp >= 48828125) {
				t =temp/48828125;
				r = r+t;
			}
			if(temp >= 244140625) {
				t =temp/244140625;
				r = r+t;
			}
			ResultList.add(r);
			r=0;
			m--;
			i++;
			
			
		}
		Iterator<Integer> itr = ResultList.iterator();
		while(itr.hasNext()) {
					System.out.println(itr.next());
		}
		
		
	}
}
