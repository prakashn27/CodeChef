package warmup;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.####");
		df.setRoundingMode(RoundingMode.CEILING);
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        in.nextLine();
        int n = cnt;
        int no_of_pos = 0, no_of_neg = 0, no_of_zeros = 0;
        while(cnt-- > 0) {
        	int a = in.nextInt();
        	if(a == 0) {
        		no_of_zeros++;
        	} else if(a > 0) {
        		no_of_pos++;
        	} else {
        		no_of_neg++;
        	}
        }
        Double p = (double)no_of_pos/n;
        System.out.println(df.format(p));
        System.out.println(df.format((double)no_of_neg/n));
        System.out.println(df.format((double)no_of_zeros/n));
        in.close();
    }
}
