package Examples;

import java.util.Scanner;

public class Way_Too_Long_Words {
	public static void main(String[] args) {
		
		  Scanner scan=new Scanner(System.in);
	        int  n=scan.nextInt();
	        
	       
	        String[] words=new String[n+1];
	        for(int i=0;i<n+1;i++)
	        {
	            words[i]=scan.nextLine();
	        }

	        for(int j=0;j<n+1;j++)
	        {
	            if(words[j].length()<10)
	            {
	                System.out.print(words[j]);
	            }

	            else
	            {
	                System.out.print(words[j].charAt(0));
	                System.out.print(words[j].length()-2);
	                System.out.print(words[j].charAt(words[j].length()-1));
	            }
	            System.out.print("\n");

	           
	        }

	    }
	}

