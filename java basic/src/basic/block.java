package basic;
public class block {
	static//static block is first execute
	{
		System.out.println("sanjay");
	}
	{//init block execute 
		System.out.println("shankar");
		
	}
	void display()
	{
		System.out.println("ganesh");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sanjay1");
	    block b=new block();
	    b.display();
	   // block b1=new block();
		
	//new block();
		 

	}

}
