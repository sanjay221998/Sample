package program;
class datashare
{
	int a=3,b=10,c=67,d=9;
	void method()
	{
		int e=this.a+b;// using this keyword
		System.out.println(e);
		
	}
}
class g extends datashare
{
	void display()
	{
		System.out.println(super.a+super.d);
		super.method(); //using super key word
	}

}
public class this_super extends datashare {
	


	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		g obj=new g();
		obj.display();
		
		
	}
	

}
