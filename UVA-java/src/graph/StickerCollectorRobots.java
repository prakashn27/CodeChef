package graph;
/*
 * https://uva.onlinejudge.org/external/118/11831.pdf
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StickerCollectorRobots {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			int n, m, s;
			char[][] arena;
			String line;
			char ctemp;
			Bot b;
			ArrayList<Character> dArray = new ArrayList<Character>(Arrays.asList('N', 'L', 'S', 'O'));
			while(true) {
				n = in.nextInt();
				m = in.nextInt();
				s = in.nextInt();
				in.nextLine();
				if(n == 0 || m == 0 || s == 0) {
					break;
				}
				arena = new char[n][m];
				b = null;
				for(int i = 0; i < n; i++) {
					line = in.nextLine();
					for(int j = 0; j < m; j++) {
						ctemp = line.charAt(j);
						arena[i][j] = ctemp;
						if(ctemp == 'N' || ctemp == 'S' || ctemp == 'L' || ctemp == 'O') {
							b = new Bot(i, j, dArray.indexOf(ctemp));
						}
					}
				}
				if(b == null) {
					System.out.println("location of bot is not defined");
					throw new Exception("location of bot is not defined");
				}
				b.setBoundry(n, m);
				line = in.nextLine();
				for(int k = 0; k < s; k++) {
					ctemp = line.charAt(k);
					switch(ctemp) {
					case 'D':
						b.D();
						break;
					case 'E':
						b.E();
						break;
					case 'F':
						b.F(arena);
						break;
					default:
						System.out.println("Operation " + ctemp + " is not defined.");
					}
					//System.out.println(b);
				}
				System.out.println(b.flags);
			}
			in.close();
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}

}



class Bot {
	int x, y; //position
	public int n, m; //endPoints
	int dIndex;
	int flags;
	@SuppressWarnings("unchecked")
	ArrayList<Character> direction = new ArrayList<Character>(Arrays.asList('N', 'E', 'S', 'W'));
	Bot(int x, int y, int dindex) {
		this.x = x;
		this.y = y;
		this.dIndex = dindex;
		flags = 0;
	}
	public void setBoundry(int n, int m) {
		this.n = n;
		this.m = m;
	}
	public void D() {
		int newIndex = (dIndex + 1) % 4;
		dIndex = newIndex;
	}
	public void E() {
		int newIndex = (dIndex + 4 -1) % 4;
		dIndex = newIndex;
	}
	
	public void F(char[][] arena) {
		int newPosition;
		switch(dIndex) {
		case 0: //N
			newPosition = x-1;
			if(newPosition >= 0 && arena[newPosition][y] != '#') {
				if(arena[newPosition][y] == '*') {
					flags++;
					arena[newPosition][y] = '.';
				}
				x = newPosition;
			} else {
				//System.out.println("N: invalid move or stall move..");
			}
			break;
		case 1: //E
			newPosition = y+1;
			if(newPosition < m && arena[x][newPosition] != '#') {
				if(arena[x][newPosition] == '*') {
					flags++;
					arena[x][newPosition] = '.';
				}
				y = newPosition;
			} else {
				//System.out.println("E: invalid move or stall move..");
			}
			break;
		case 2: //S
			newPosition = x+1;
			if(newPosition < n && (arena[newPosition][y] != '#')) {
				if(arena[newPosition][y] == '*') {
					flags++;
					arena[newPosition][y] = '.';
				}
				x = newPosition;
			} else {
				//System.out.println("S: invalid move or stall move..");
			}
			break;
		case 3: //E
			newPosition = y-1;
			if(newPosition >= 0 && arena[x][newPosition] != '#') {
				if(arena[x][newPosition] == '*') {
					flags++;
					arena[x][newPosition] = '.';
				}
				y = newPosition;
			} else {
				//System.out.println("E: invalid move or stall move..");
			}
			break;
		default:
			//System.out.println("Invalid selection in F function");
		}
	}
	
	public String toString() {
		return "X :" + x + " Y:" + y + " Direction :" + dIndex;
	}
}

