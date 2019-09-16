package RarSenario;

import java.util.Scanner;
class Arith{
int	add(int a,int b)
	{
	int c;
	c=a/b;
	System.out.println(c);
		return c;
	}
}

public class TryWithOutUseCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arith a=new Arith();
		try(Scanner sc=new Scanner(System.in))
		{
			
			a.add(4, 4);
		}
		
	}

}
