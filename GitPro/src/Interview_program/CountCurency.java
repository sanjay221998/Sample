package Interview_program;

public class CountCurency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rupes[]= {2000,500,200,100,50,20,10,5,2,1};
		int rupiscount[]=new int[rupes.length];
		int amount=4597;
		for(int i=0;i<rupiscount.length;i++) {
			rupiscount[i]=amount/rupes[i];
			amount=amount-rupiscount[i]*rupes[i];
			
		}
		for(int a=0;a<rupiscount.length;a++)
		{
			System.out.println("rupise "+rupes[a]+"--------->"+"number of notes  "+rupiscount[a]);
		}
	}

}
