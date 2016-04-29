/**
 * 
 */
package graph;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

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
		int t, r, c, m, n, w, x, y;
		int[][] water, paths;
		boolean[][] visited;
		
		t = in.nextInt();
		for(int case_number = 1; case_number <= t; case_number++) {
			r = in.nextInt();
			c = in.nextInt();
			m = in.nextInt();
			n = in.nextInt();
			w = in.nextInt();
			water = new int[r][c];
			paths = new int[r][c];
			visited = new boolean[r][c];
			LinkedList<Position> possible_moves = new LinkedList<Position>();
			possible_moves.add(new Position(m, n));
			possible_moves.add(new Position(m, -n));
			possible_moves.add(new Position(-m, n));
			possible_moves.add(new Position(-m, -n));
			possible_moves.add(new Position(n, m));
			possible_moves.add(new Position(n, -m));
			possible_moves.add(new Position(-n, m));
			possible_moves.add(new Position(-n, -m));
			for(int i = 0; i < r; i++) {
				for(int j = 0; j < c; j++) {
					water[i][j] = 0;
					paths[i][j] = 0;
					visited[i][j] = false;
				}
			}
			for(int k = 0; k < w; k++) {
				x = in.nextInt();
				y = in.nextInt();
				water[x][y] = 1;
			}
			Stack<Position> s = new Stack<Position>();
			s.push(new Position(0, 0));
			while(!s.isEmpty()) {
				Position pTemp = s.pop();
				// check out the posible moves for the temp;
				// if it is valid and it is not water then push it into stack
				// make sure to increment the count every time we go to path in the grid
				x = pTemp.x;
				y = pTemp.y; 
				visited[x][y] = true;
				for(Position p : possible_moves) {
					int xx = x + p.x;
					int yy = y + p.y;
					if(xx >= 0 && xx < r && yy >= 0 && yy < c && !visited[xx][yy] && water[xx][yy] != 1) {
						paths[x][y]++;
						s.push(new Position(xx, yy));
					}
				}
			}
			int odd = 0, even = 0;
			for(int i = 0; i < r; i++) {
				for(int j = 0; j < c; j++) {
					if(paths[i][j] % 2 == 1) {
						odd++;
					} else {
						even++;
					}
				}
			}
			
			System.out.println(case_number + " : " + even + " " + odd);
		}
		in.close();

	}

}
class Position {
	int x, y;
	Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
