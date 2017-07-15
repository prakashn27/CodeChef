package getting_started.Nplus1;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * PC/UVa IDs: 110101/100, Popularity: A, Success rate: low Level: 1
 *
 inp:
 1 10
 100 200
 201 210
 900 1000

 Output:
 1 10 20
 100 200 125
 201 210 89
 900 1000 174

 * Created by prakashn on 22/12/2015.
 */
public class Main {
    public static int cache[] = new int[1000000];
    public static long next(long n) {
        if (n % 2 == 0)
            return n / 2;       // if n is even
        else
            return 3 * n + 1;   // if n is odd
    }

    public static int cycle(long n) {
        if(n == 1) {
            return 1;
        }

        if(n < 1000000 && cache[(int)n] != 0) {
            return cache[(int)n];
        }

        int result = 1 + cycle((int)next(n));
        if(n < 1000000) cache[(int)n] = result;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNextInt()) {
            int a = in.nextInt(),
                b = in.nextInt(),
                n, max = Integer.MIN_VALUE;
            for (n = a; n <= b; n++) {
                max = Math.max(max, cycle(n));
            }
            System.out.println(a + " " + b + " " + max);
        }
    }
}
