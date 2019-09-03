package string_pack;

class abc{
	
}
public class hashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="sanjay";
		System.out.println(a.hashCode());
		String b="sanjay";
		System.out.println(b.hashCode());
		String c=new String("sanjay");
		System.out.println(c.hashCode());
		String d=new String("sanjay");
		System.out.println(d.hashCode());
		String e="sam";
		System.out.println(e.hashCode());
		abc o1=new abc();
		System.out.println(o1.hashCode());
		abc o2=new abc();
		System.out.println(o2.hashCode());
	}

}
