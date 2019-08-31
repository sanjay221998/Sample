package string_pack;

public class str_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		System.out.println(s.length());
		System.out.println(s.concat("programing"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.equals("java"));
		System.out.println(s.equalsIgnoreCase("JAVA"));
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.concat("ja"));
		System.out.println(s);
		System.out.println(s.startsWith("a"));
		System.out.println(s.endsWith("a"));
		System.out.println(s.startsWith("a", 0));
		System.out.println(s.isEmpty());
		System.out.println(s.trim());
		System.out.println(s.substring(2));
		System.out.println(s.substring(1, 3));
		char b[]=s.toCharArray();
		for(char bb:b)//string to char array
			System.out.print(bb+" ");
		byte c[]=s.getBytes();//converting char sequence to ascii
		for(byte cc:c)
			System.out.println("\n"+cc);

	}

}
