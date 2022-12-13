package dayonetask;

public class CountNoOfWordsInString {

	public static void main(String[] args) {
		String str = "programming";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')  
				count++;
			}
		
		System.out.println("Number of words in a string : " + count);
	}
}

