package Interview_program;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int m=7;
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=7;j++)
			{
				if((3-(i+j)>=0 && j<=4)||((i-j+3)<=0 && j>=3))
				{
					System.out.print(" "+" ");
				}
				else
				{
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
	}

}
