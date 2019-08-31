package basic;

public class block_confuse {
int c=1;
{
	c=2;
	System.out.println("sanjay");
}
block_confuse(int c)
{
	this.c=c;
	System.out.println("shankar");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("shankar1");
		block_confuse obj=new block_confuse(3);
		System.out.println(obj.c);
	}

}
