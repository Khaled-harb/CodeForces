package Examples;

import java.util.Scanner;

public class Petya_and_Strings {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        String String= scan.nextLine().toLowerCase();
	        String String2= scan.nextLine().toLowerCase();
	        int result= String.compareTo(String2);
	        if(result >0){
	           System.out.println(1);
	        }
	        else if(result<0){
	            System.out.println(-1);
	        }else {
	            System.out.println(0);
	        }
	    }

}
