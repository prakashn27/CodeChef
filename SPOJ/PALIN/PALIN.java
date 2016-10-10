import java.util.Scanner;

public class PALINNEW {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int nextNum = sc.nextInt();
		for(int z = 0; z < nextNum ;z++)
		{
			String s = sc.next();

			String ans = s.substring(0,s.length()/2);
			if(s.length()%2 == 1)
			{
				ans = ans + s.charAt((s.length()/2))+rev(ans);
			}else
				ans += rev(ans);
			if(larger(ans,s))
			{
				System.out.println(ans);
				//System.out.println("check larger loop");
			}else{
				boolean Notall9 = false;
				for(int i = (s.length()-1)/2;i>=0;i--)
				{
					//System.out.println("for value of i:"+i);
					if(ans.charAt(i) != '9')
					{	
						//System.out.println("ans.charAt(i"+i+")="+ans.charAt(i));
						Notall9 = true;
						if(i == s.length()/2 && s.length()%2 == 1)//19291 -> 19391
						{
							ans = ans.substring(0,s.length()/2)+((char)(ans.charAt(i)+1))+ans.substring(s.length()/2+1);
							//System.out.println("ans="+ans);
							
						}else{  //
							if(s.length()%2 == 1)
							{	//zeros uploaded for neglected 9 values
								ans = ans.substring(0,i)+((char)(ans.charAt(i)+1))+zeros(s.length()/2 - i-1);
								//System.out.println("before addition:"+ans);
								ans = ans+"0"+rev(ans);
								//System.out.println("after addition:"+ans);
							}else{ //129921 = 129->130  
								//zeros uploaded for neglected 9 values only for center position
								ans = ans.substring(0,i)+((char)(ans.charAt(i)+1))+zeros(s.length()/2 - i-1);
								//System.out.println("Even before addition:"+ans);
								ans = ans+rev(ans);
								//System.out.println("even after addition:"+ans);
							}
						}
						break;
					}
				}
				if(Notall9) System.out.println(ans);
				else
				{
					ans = "1";
					while(ans.length() < s.length())
						ans +="0";
					ans += "1";
					System.out.println(ans);
				}
			}
		}
		sc.close();
	}

	private static String zeros(int i) {
		StringBuilder z = new StringBuilder();
		for(int j = 0; j < i;j++)
			z.append("0");
		return z.toString();
	}
	private static boolean larger(String ans, String s) {
		for(int i = 0; i < ans.length();i++)
		{
			char a = ans.charAt(i);
			char b = s.charAt(i);
			if(a < b) return false;
			if(a > b) return true;
		}
		return false;
	}

	private static String rev(String ans) {
		StringBuilder st = new StringBuilder(ans);
		return st.reverse().toString();
	}
}
