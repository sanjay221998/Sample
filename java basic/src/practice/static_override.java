package practice;

class foo{
	
	 static void method()
	{
		System.out.println("infoo");
	}
	/*final void method() //final method cannot override
	{
		System.out.println("infoo");
	}*/
}
class bar extends foo
{
	 public static void method()//static method only overriding another static method (not static override instance method)
	{
		System.out.println("inbar");
		
	}
}
public class static_override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//foo f=new foo();
		//f.method();
		//bar b=new bar();
		//b.method();
		bar.method();
		//foo.method();

	}

}
