package program;
class checkA
{
	 int a=1;
	final void disp()//final method can't override
	{
		//System.out.println(checkA.a);
		System.out.println(a);
	}
}
class checkB extends checkA
{
	 int a=2;
	 void display()
	{
		//System.out.println(checkB.a+checkA.a);this and super only access instant variable ,static method dosen't acess instant variable
		System.out.println(this.a+super.a);
	}
}

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkB b=new checkB();
		b.disp();
	//	checkB.display();
		b.display();

	}

}
