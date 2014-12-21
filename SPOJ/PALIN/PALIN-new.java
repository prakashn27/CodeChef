import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PALIN {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases = Integer.parseInt(br.readLine());
		while (noOfTestCases > 0) {
			String inpString = br.readLine();
			char[] inpChar = new char[inpString.length()];
			inpString.getChars(0, inpString.length(), inpChar, 0);
			NextPalindrome(inpChar);
			noOfTestCases--;
		}

	}

	private static void NextPalindrome(char[] inpChar) {
		int length = inpChar.length;
		int  carry = 0, i, j;
		if (AllAre9(inpChar)) {
			System.out.print("1");
			for (int k = 0; k < length - 1; k++)
				// 99->101 lenght=2 number of zero=2-1
				System.out.print("0");
			System.out.print("1");
			System.out.println();
		} else { // inp is palindrome add +1 to center digit
			int mid = length / 2;
			Boolean leftSmaller = false;

			if ((length % 2) == 0) { // for even i,j are different places
				i = mid - 1; // since array starts by 0 to index correctly we
								// subtract by 1
				j = mid;
			} else { // for odd i and j are same
				i = mid;
				j = i;
			}
			while (i > 0 && (int) inpChar[i] == (int) inpChar[j]) {
				i--;
				j++;
			}
			// to handle array index out of bound exception(to avoid i to get <0
			if (i == 0 && (int)inpChar[i] == (int) inpChar[j]) {
				leftSmaller = true;
				
			}
			if((int) inpChar[i] < (int) inpChar[j]){
				leftSmaller = true;
				
			}
			// in case if al the elements are equal
			// left is less than right side we should increment the mid
			// copy left to right
			while (i >= 0) {
				inpChar[j] = inpChar[i];
				if(i == 0){
					break;
					//to avoid the values to go less than 0
				}
				i--;
				j++;
			}
			if (leftSmaller) {
				i = mid - 1;
				carry = 1;
				if (length % 2 == 1) {
					//i = mid;
					inpChar[mid] = (char) ((int) inpChar[mid] + carry);
					if((char)inpChar[i] > '9') {
						carry = 1;
						inpChar[mid] = (char) (inpChar[mid] - 10);
					}
					else carry = 0;
					j = mid+1;
				} else {
					j = mid;
					
				}
				while (i > 0) {
					inpChar[i] =  (char) (inpChar[i] + carry);
					if((char)inpChar[i] > '9')
					{
						carry = 1;
						inpChar[i] = (char) (inpChar[i] - 10);
					}
					else{
						carry = 0;
					}
					inpChar[j++] = inpChar[i--];
					
				}
			}
			for (int k = 0; k < length; k++) {
				System.out.print(inpChar[k]);
			}
			System.out.println();
		}
		
	}
	private static boolean AllAre9(char[] inpChar) {
		for (int i = 0; i < inpChar.length; i++)
			if (inpChar[i] != '9')
				return false;
		return true;
	}

}
