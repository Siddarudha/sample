/**
 * 
 */
package TestScripts;

public class TestProgram {

	public static void main(String[] args) throws Exception {
		
		 int a = 50, b = 20, c; c = a > b ? a : b; 
		 System.out.println(c);
		 

		/*
		 * String rev = ""; String str = "Automation Program is Very Good"; for (int i =
		 * 0; i < str.length(); i++) { char ch = str.charAt(i); rev = ch + rev; }
		 * System.out.println(rev);
		 */
		int rev = 0;
		int num = 123456789;
		while (num != 0) {

			int number = num % 10;
			rev = rev * 10 + number;
			num = num / 10;
		}
		System.out.println(rev);
	}

}
