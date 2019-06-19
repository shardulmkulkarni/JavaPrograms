package tayari;

public class PalindromeLatest {

	public static void main(String[] args) {

		String s1 = "madam";
		int length = s1.length() - 1;
		boolean flag = true;

		for (int i = 0; i < length / 2; i++) {
			if (s1.charAt(i) != s1.charAt(length - i)) {
				flag = false;
				break;
			}
			System.out.println(i);
		}
		System.out.println(flag);

	}

}