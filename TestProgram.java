/**
 * 
 */
package TestScripts;

public class TestProgram {

	public static void main(String[] args) throws Exception {

		// Print largest number among two
		int a = 50, b = 20, c;
		c = a > b ? a : b;
		System.out.println(c);
// Print reverse of the given string
		String rev = "";
		String str = "Automation Program is Very Good";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			rev = ch + rev;
		}
		System.out.println(rev);
// Print reverse of the given number
		int revs = 0;
		int num = 123456789;
		while (num != 0) {

			int number = num % 10;
			revs = revs * 10 + number;
			num = num / 10;
		}
		System.out.println(revs);
	}

}
