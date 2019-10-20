package Interview_Question;
import java.util.*;
public class Numdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9,10,11};
		ArrayList<Integer> al=new ArrayList<Integer>();
		int count=0,rem=0;
		for(int i=0;i<a.length;i++)
		{
			while(a[i]>0)
			{
				rem=a[i]%10;
				al.add(rem);
				a[i]=a[i]/10;
			}
		}
		Iterator ite=al.iterator();
		System.out.println(al);
		while(ite.hasNext())
		{
			if(ite.next().equals(5))
			{
				count++;
			}
		}
		System.out.println(count);
		System.out.println("\n\n"+"sanja"+"\\n"+"y");
		String s[]= {"sanjay/vicky","uma/raji","kaarunya/varun","srinee/radhika"};
		String s2[]=new String[s.length*2];
		ArrayList<String> bl=new ArrayList<String>();
		for(int i=0;i<s.length;i++)
		{
			//bl.addAll(s[i].replace("/", " "));
		}
		
	}
	

}
