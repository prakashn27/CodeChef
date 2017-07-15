package getting_started;

import java.util.Scanner;


/**
 * Created by prakashn on 18/12/2015.
 */
public class Minesweeper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            Character[][] mine = new Character[m][n];
            int col, row = 0;
            while(row < n) {
                String line = sc.next();
                col = 0;

                row++;
            }
        }
    }
}

