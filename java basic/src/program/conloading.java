package program;

public class conloading {

	int stduId;
	int total;
	double avg;
	/*conloading(int stdId,int total,double avg)
	{
	this.stduId=stdId;
	this.total=total;
	this.avg=avg;
}*/

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	conloading std1=new conloading(01,400,80.0);
	conloading std2=new conloading(02,300,60.0);
	conloading std3=new conloading(03,200,40.0);
	System.out.println(std1.avg+" ----> "+std2.avg);
	System.out.println(std3.avg+" ----> "+std2.avg);
	
	

}
	public conloading(int stduId, int total, double avg) {
		super();
		this.stduId = stduId;
		this.total = total;
		this.avg = avg;
	}
}
