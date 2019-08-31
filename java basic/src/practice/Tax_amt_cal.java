package practice;

import java.util.Scanner;

public class Tax_amt_cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner ab=new Scanner(System.in);
	System.out.println("ENTER SALARY:");
	double salary=ab.nextDouble();
	double tax=0;
	{
	if(salary>=0 && salary<=500000)
	{
		tax=salary*0;
		System.out.println(tax);
		
	}
	
	else if(salary>=500001 && salary<=1000000)
	{
		tax=(salary*5.0/100);
		System.out.println(tax);
		
	}
	else
	{
		tax=(salary*10.0/100);
		System.out.println(tax);
	}
	}
	ab.close();
	}

}
