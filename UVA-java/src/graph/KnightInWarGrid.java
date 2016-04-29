/**
 * 
 */
package graph;

import java.util.Scanner;

/**
 * @author prakashn
 * https://uva.onlinejudge.org/external/119/11906.pdf
 * Input 
2
3 3 2 1
0
4 4 1 2
2
3 3
1 1
 */
public class KnightInWarGrid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t, r, c, m, n, w;
		int[][] table, paths;
		boolean[][] visited;
		
		t = in.nextInt();
		while(t-- != 0) {
			r = in.nextInt();
			c = in.nextInt();
			m = in.nextInt();
			n = in.nextInt();
			w = in.nextInt();
			table = new int[r][c];
			paths = new int[r][c];
			visited = new boolean[r][c];
			
			

			
		}
		in.close();

	}

}
