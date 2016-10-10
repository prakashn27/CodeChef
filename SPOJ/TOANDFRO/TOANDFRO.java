import java.util.Scanner;

public class TOANDFRO {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			int col = in.nextInt();
			in.nextLine();
			if(col == 0) {
				break;
			}
			String line = in.nextLine();
			int row = line.length() / col;
			StringBuilder[] sb_arr = new StringBuilder[row];
			Boolean reverse = false;
//			System.out.println("row :" + row + "/n col:" + col);
			for(int y = 0; y < row; y++) {
				sb_arr[y] = new StringBuilder();
				for(int x = 0; x < col; x++) {
//					System.out.print(y*col + x);
//					System.out.print(" ");
//					System.out.print(line.charAt(y*col + x));
					sb_arr[y].append(line.charAt(y*col + x));
				}
				if(reverse) {
					sb_arr[y] = sb_arr[y].reverse();
				}
				reverse = !reverse;
//				System.out.println(sb_arr[y].toString());
			}
			StringBuilder res = new StringBuilder(); 
			for(int x = 0; x < col; x++) {
				for(int y = 0; y < row; y++) {
					res.append(sb_arr[y].charAt(x));
				}
			}
			System.out.println(res.toString());
			
		}

	}

}
