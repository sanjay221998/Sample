package patterns;

class pattern {
	public static void main(String[] args) {

        int rows = 5;
        System.out.println("------ PATTERN 1 ------");

        for (int i = 1 ; i <= rows ; i++){
            for (int j = rows; j >= i ; j--){
                System.out.print(j);
            }
            System.out.println();

        }


        /*System.out.println("\n------ PATTERN 2 ------");

        for (int i = 1 ; i <= rows ; i++){
            int k;
            for (k = rows ; k > i; k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= k ; j++){
                System.out.print(j);
            }
            System.out.println();

        }
 System.out.println("\n------ PATTERN 3 ------");


        for (int i = rows ; i >= 1 ; i--){
            int k;
            for (k = rows ; k > i; k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= k ; j++){
                System.out.print(j);
            }
            System.out.println();   
        }

        System.out.println("\n------ PATTERN 4 ------");

        int whitespaces = rows/2;
        for (int i = 1 ; i <= rows; i++){
            // absolute value of whitespaces
            int abs_whitespaces = 
                    (whitespaces < 0 ? -whitespaces : whitespaces);
            for (int j = 0 ; j < abs_whitespaces ; j++){
                System.out.print(" ");
            }

            for (int j = 1 ; j <= rows - 2 * abs_whitespaces ; j++){
                System.out.print(j);
            }
whitespaces-=1;
            System.out.println();

        }*/   
    }




}
