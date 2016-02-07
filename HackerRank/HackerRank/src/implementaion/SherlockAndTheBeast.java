package implementaion;

import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndTheBeast {
	
	public static void getPerfectNumber(int N) {
		boolean flag=false;
		int n5 = N/3;
        int n3 = N-n5*3;
        while(n5>0&&n3>0&&n3%5!=0){
            n5--;
            n3 = N-n5*3;

        }
        if(n3%5==0){
            flag = true;
        }
        if(flag==false){
            System.out.println("-1");
        }
        else{
            //int n3 = (int) n3_d;
            while(n5>0){
                System.out.print("555");
                n5--;
            }
            while(n3>0){
                System.out.print("3");
                n3--;
            }
            System.out.println();

        }
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt = in.nextInt();
		in.nextLine();
		while(cnt-- > 0) {
			int val = in.nextInt();
			getPerfectNumber(val);
//			System.out.println(result);
		}
		in.close();

	}

}
