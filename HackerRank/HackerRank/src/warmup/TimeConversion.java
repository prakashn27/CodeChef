package warmup;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		// 07:05:45PM
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		String[] spl = line.split(":");
		if(spl.length != 3) {
			System.exit(0);
		}
		if(spl[2].contains("AM") || spl[2].contains("PM")) {
//			System.out.println(spl[2].charAt(0) + " " + spl[2].charAt(1));
			String hh = spl[0];
			String mm = spl[1];
			String ss = spl[2].substring(0, 2);
			String time = spl[2].substring(2);
//			System.out.println(ss + ":" + time);	
			if(time.equals("AM")) {
				if(hh.equals("12")) {
//					change to 00
					hh = "00";
				}
			} else {
				//PM
				if(!hh.equals("12")) {
					int _hh = Integer.parseInt(hh);
					_hh = _hh + 12;
					hh = String.valueOf(_hh);
				}
			}
			System.out.println(hh+ ":" + mm + ":" + ss);
			
		}
//		System.out.println(spl);
		
		sc.close();

	}

}
