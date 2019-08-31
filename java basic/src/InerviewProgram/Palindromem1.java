package InerviewProgram;

public class Palindromem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "malayalam";
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s2);
		if (s2.equals(s1)) {
			System.out.println("palindrome");
		}

		else {
			System.out.println("not a palindrome");
		}
	}
}
