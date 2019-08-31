package basic;

public class multiplefor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 10; i >= 1; i--) {
			for (int j = 1; j <= 10; j++) {
				if(i==j)
					//that using equalt value only display
				System.out.println(i + " " + j);
				
					count=count+1;
				}
			}
			
			System.out.println(" count -->"+count);

		}
	}

