package basic;
class XA
{
	int a=1;

}
class XB extends XA
{
	int a=2;
	int confusion()
	{
		int a=3;
		int x=a+this.a+super.a;
		System.out.println(x);
		return x;
		
	}
}

public class variableconfusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XB xb=new XB();
		xb.confusion();
		
	}

}
