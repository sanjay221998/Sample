package Attend_interview_program;

import java.util.Scanner;

public class FirstRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			FirstRepeatedChar frc = new FirstRepeatedChar();
			frc.mainLoop();
		}
	    void mainLoop() {
	    	Scanner sc = new Scanner( System.in);     
	       // str = " ";
	        System.out.println("Please enter a string: ");
	       // Scanner sc;
			String str = sc.next();
			
			//System.out.println(str.indexOf());
	        str = str.toLowerCase();
	        for(int i = 0; i < str.length(); i++) {
	            char character = str.charAt(i);
	            int firstIndex = str.indexOf(character);
	            
	            int lastIndex = str.lastIndexOf(character);
	            if(firstIndex != lastIndex) {
	                System.out.println("The character '"+character+"' is repeated");
	                break; 
	            }
	           // System.out.println(character);
	        }
	    }
	
	}


