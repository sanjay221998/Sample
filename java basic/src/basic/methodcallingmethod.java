package basic;

class YA
{
	int a=1;
	void display()
	{
		System.out.println("hi");
	
	}
}
	class YB extends YA
	{
	void disp()
	{
		System.out.println("hey");
	}
	void dis()
	{
		//super.display();//access parent class method
		System.err.println("hello\n");
		//disp();method call
		disp();
		
	}
}

public class methodcallingmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YA yb=new YB();
		yb.display();
		
		}

}
