package Examples;

import java.util.Scanner;

public class Beautiful_Matrix{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	        int x= 3;
	        int y= 3;
	        int row1= 0;
	        int column1= 0;
	        for(int i1=1;i1<=5;i1++)
	        {
	           String s= sc.nextLine().replace(" ","");
	           if (s.contains("1"))
	           {
	               row1= i1;
	               column1= s.indexOf("1")+1;
	               break;
	           }
	 
	        }
	        System.out.println(Math.abs(y-row1) + Math.abs(x-column1));
	 
	    }
	}


