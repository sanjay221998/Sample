package program;

class classA {
	int mark(int m1)// overloading
	{
		System.out.println("\t  OVERLOADING  \t");
		System.out.println("m1=" + m1);
		return m1;
	}

	int mark(int m1, int m2) {
		System.out.println(m1 + m2);
		return m1 + m2;
	}

	void first_mark() {
		System.out.println("sanjay");
	}
}

class classB extends classA {
	void first_mark()// overriding
	{
		System.out.println("\t   OVERRIDING   \t");
		System.out.println("vimal");
		System.out.println(" \t METHOD CALLING \t");
		super.mark(1, 9);// method calling

	}

}

class classC// final using this class
{

	static double area() {
		System.out.println("\t  FINAL AND STATIC USING THIS CLASS  \t");
		final double PI = 3.14;
		int r = 5;
		double a = PI * r * r;
		System.out.println(a);
		return a;
	}

	static void loop() {
		System.out.println("\t   BREAK USING   \t");
		abs: for (int i = 1; i <= 10; i++)// abs label usingthis line
		{
			if (i == 6)

				break abs;

			System.out.println(i + " ");
		}	
		
		System.out.println("\t   CONTINUE USING   \t");
		for (int k = 1; k <= 10; k++) {
			if (k % 2 == 0) {
				continue;

			}
			System.out.println(k + " ");
		}

	}


}

public class multi_task {

	int stdID;
	int total;
	double avg;

	public multi_task(int stdID, int total, double avg) {
		super();
		this.stdID = stdID;
		this.total = total;
		this.avg = avg;
	}

	multi_task(int stdID, int total) {
		this.stdID = stdID;
		this.total = total;
		avg = 60.0;
	}

	void display() {
		System.out.println("\t CONSTRUCTOR OVERLOADING \t");
		System.out.println(stdID);
		System.out.println(total);
		System.out.println(avg);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(new classA(10).getn()); 
		int b=001;
		classA obj1 = new classA();
		obj1.mark(2);
		obj1.mark(10, 13);
		//classB obj = new classB();
		//obj.first_mark();
		new classB().first_mark();//anonymous obj
		// circle c=new circle();
		classC.area();
		classC.loop();

		multi_task m1 = new multi_task(b, 400, 80.8);
		m1.display();
		multi_task m2 = new multi_task(002, 300);
		m2.display();
	}

}
