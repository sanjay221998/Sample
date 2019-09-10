package Interview_program;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first word:");
		s1 = sc.next();
		System.out.println("Enter second word:");
		s2 = sc.next();
		char[] w1 = s1.toCharArray();
		char[] w2 = s2.toCharArray();
		Arrays.sort(w1);
		System.out.println(w1);//verification
		Arrays.sort(w2);
		System.out.println(w2);//verification		
		System.out.println(Arrays.equals(w1, w2));//that line is not mandatory
		String a = new String(w1);
		String b = new String(w2);
		System.out.println(b);//verification
		
	//System.out.println(a.hashCode());	
		//System.out.println(b.hashCode());
		if (a.equals(b)) {
			System.out.println(s1 + " and " + s2 + " are anagram");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagram");
		}
		sc.close();
	}

}
