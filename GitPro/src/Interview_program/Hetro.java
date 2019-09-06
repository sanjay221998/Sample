package Interview_program;
class add{
int add1() 
	{
	int a=7,b=8,c;
	c=a+b;
	System.out.println(c);
	return c;
	
	}
}
public class Hetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Object hetro[]= {"sam",3,5.6,'a','e',true};
		System.out.println(hetro[4]);
		System.out.println(hetro[5]);
		System.out.println(hetro[4].getClass());
		System.out.println(hetro[5].getClass());*/
		
		for(int i=0;i<1000;i++)
		{
			add a=new add();
			a.add1();
		}
		
		
	}

}
