package basic;
abstract class Arith
{
	
	abstract int sub();
	abstract int div();
}
class Metic extends Arith
{
	int a=7,b=10;
	int sub() {
		int i=a-b;
		System.out.println(i);
		return i;
	}
	int div()
	{
		int i=a/b;
		System.out.println(i);
		return i;
		
	}
}
public class Myabstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Metic m=new Metic();
		m.div();
		m.sub();

		
	}

}
