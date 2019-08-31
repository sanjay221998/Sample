package practice;
interface in
{
	void m();
}
public class passi_inf_as_parameter {
	//static void catchInterface(in obj)
	//obj.m();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*passi_inf_as_parameter.catchInterface(new in()//method calling
				{
				public void m()
				{
					System.out.println("pass inter face obj as a parameter");
				}
				});*/
		in obj=new in()
				{
			public void m()
			{
				System.out.println("pass inter face obj as a parameter");
			}
				};
				obj.m();
	}

}
