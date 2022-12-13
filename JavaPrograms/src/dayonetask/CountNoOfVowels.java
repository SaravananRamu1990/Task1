package dayonetask;

import java.io.IOException;

public class CountNoOfVowels {

	public static void main(String[] args) throws IOException {
		String str = "i am an automation QA engineer";
		str = str.toLowerCase();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println("Total no of vowels in string are: " + count);
	}
}
