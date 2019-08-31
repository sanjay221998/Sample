package string_pack;

public class Uppercase_with_out_method {

	public static void main(String[] args) {
		String s = "java";
		byte b[] = s.getBytes();

		if (!(b[0] >= 65 && b[0] <= 90)) {
			System.out.print((char) (b[0] - 32));
		} else {
			System.out.print((char) b[0]);
		}
		for (int i = 1; i < b.length; i++) {
			System.out.print((char) b[i]);
		}
	}
}
