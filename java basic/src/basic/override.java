package basic;
class ab
{
	void display()
	{
		System.out.println("sanjay");
	}
}
class bc extends ab
{
	void display()
	{
		System.out.println("shankar");
	}
}

public class override {
	public static void main(String[] args) {
		bc obj=new bc();
		obj.display();
	}

}
