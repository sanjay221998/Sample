package practice;
import java.util.Scanner;

public class Arith_u_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("ENTER A VALUE:");
     double a=sc.nextDouble();
     System.out.println("ENTER B VALUE:");
     double b=sc.nextDouble();
     System.out.println("ENTER A OPERATOR:");
     char c=sc.next().charAt(0);
     double d;
     switch(c)
     {
     case '+':
     d=a+b;
     System.out.println(d);
     break;
     case '-':
         d=a-b;
         System.out.println(d);
         break;
     case '/':
         d=a/b;
         System.out.println(d);
         break;
     case '*':
         d=a*b;
         System.out.println(d);
         break;
     case '%':
         d=a%b;
         System.out.println(d);
         break;
     
     }
     
     sc.close();
     
	}

}
