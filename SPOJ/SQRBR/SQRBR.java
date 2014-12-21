import java.util.*;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.BufferedReader;
//http://www.spoj.com/problems/SQRBR/
/*
1 1     n k
1 		k inces
1 1 
2 
2 1 
1 
3 1 
2 
4 2 
5 7 
*/
class SquareBrackets {
	public static void main(String[] args){
		InputScanner iscan = new InputScanner(System.in);
		int d = iscan.nextInt();
		while(d != 0){

			int n = iscan.nextInt();
			int k = iscan.nextInt();
			List<Integer> a = new ArrayList<Integer>();
			while(k != 0) {
				a.add(iscan.nextInt());
				k--;
			}
			Object[] obja = a.toArray(); //returns Object type 
			Integer[] indices = Arrays.copyOf(obja, obja.length, Integer[].class);
			System.out.println(squareBrackets(n, indices));
			d--;
		}
		 
		//int[] k = {2}; // k indices 
		//System.out.println(squareBrackets(1, k)); // (n, a)
	}
	public static int squareBrackets(int n, Integer[] indices){
		return sbAux(2*n, 0, indices, 0, new HashMap<Pair, Integer>());
	}
	private static int sbAux(int n, int index, Integer[] indices, int numOpen, HashMap<Pair, Integer> table){
		Pair p = new Pair(index, numOpen);
		if(index == n) //end case
			return (numOpen == 0) ? 1 : 0;
		if(table.containsKey(p)) //memoization case
			return table.get(p);
		int sum = 0;
		//binarySearch(int[] a, int key)
		//Searches the specified array of ints for the specified value using the binary search algorithm.
		if(Arrays.binarySearch(indices, index) >= 0 && numOpen < n/2)
			sum= sbAux(n, index+1, indices, numOpen+1, table);
		else{
			if(numOpen > 0) //close parenthesis
				sum += sbAux(n, index+1, indices, numOpen-1, table);
			if (numOpen < n/2) //open parenthesis
				sum += sbAux(n, index+1, indices, numOpen+1, table);
		}
		table.put(p, sum);
		return sum;
	}
	public static class Pair{
		int position;
		int numOpen;
		public Pair(int pos, int numOpen){
			this.position = pos;
			this.numOpen = numOpen;
		}
		public String toString(){
			return position+" "+numOpen;
		}
		public int hashCode(){
			return toString().hashCode();
		}
	}
	public static class InputScanner {
	private final BufferedReader br;
	// can be used to seperate tokens instead of String.split("\\s+")
	StringTokenizer tokenizer;

	public InputScanner(InputStream stream) {
		br = new BufferedReader(new InputStreamReader(stream));
	}

	// for calling the next token in the string
	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	// next methodis called and the input is parsed
	public int nextInt() {
		int n = Integer.parseInt(next());
		return n;
	}

}
}
