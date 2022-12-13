package dayonetask;

public class CountNumberOfWords {

	public static void main(String[] args) {
		String str = "Java is one of many high-level programming languages,that use abstraction to create software for computers and many other electronic devices";

		int count = 1;

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("Number of words in a string : " + count);
	}

}
