package basic;

public class distance_bw_2_point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1=3.0;
		double y1=2.0;
		double x2=13.0;
		double y2=11.0;
		double x=x2-x1;
		double a=x*x;
		double y=y2-y1;
		double b=y*y;
		double c=a+b;
		double answer=Math.sqrt(c);
		System.out.println(answer);
		
		System.out.println(Math.sqrt((Math.pow((y2-y1), 2))+(Math.pow((x2-x1), 2))));

	}

}
