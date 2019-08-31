package program;
class a
{
	void demo(int a)
	{
		System.out.println("a="+a);
		
	}
	void demo(int a,int b)
	{
		System.out.println(a+b);
		
	}
	
	void display()
	{
		System.out.println("sanjay");
	}
}
class b extends a
{
	void display()
	{
		System.out.println("vimal");
		
	}
	
}
class c  extends b
{
	void display()
	{
		System.out.println("vibe");
	}
}
public class override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a obj1=new a();
		obj1.demo(2);
		obj1.demo(12, 13);
		c obj=new c();
		obj.display();
		//classC.area();

	}

}
