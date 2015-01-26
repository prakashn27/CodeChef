package warmup;

import java.util.Scanner;
public class FlippingBits {
	public static long flippingBits(long a) {
        return (long)Math.pow(2,32) - a - 1;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long result;
        long inp;
        for(int i = 0; i < t; i++) {
            inp = in.nextLong();
            result = flippingBits(inp);
            System.out.println(result);
        }
    }
}
