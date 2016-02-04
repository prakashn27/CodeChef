package codecon;

import java.util.Scanner;

public class Palindrome {
	
	int max = Integer.MAX_VALUE;
	public static boolean istPalindrom(char[] wort){
        boolean palindrom = false;
        if(wort.length%2 == 0){
            for(int i = 0; i < wort.length/2-1; i++){
                if(wort[i] != wort[wort.length-i-1]){
                    return false; 
                }else{ 
                    palindrom = true;
                } 
            } 
        }else{ 
            for(int i = 0; i < (wort.length-1)/2-1; i++){
                if(wort[i] != wort[wort.length-i-1]){
                    return false; 
                }else{ 
                    palindrom = true;
                } 
            } 
        } 
        return palindrom;
    } 
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String original = in.nextLine();
		 
		char[] chArr =  original.toCharArray();
		
	    
	}
	
}
