package A_replit;

import java.util.Scanner;

public class question48_three_nums {
	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
		 
		 System.out.println("Enter 3 digits");
		    
		    
		    int n1 = s.nextInt();
		    int n2 = s.nextInt();
		    int n3 = s.nextInt();
		    
		    if (n1>n2 && n1>n3) {
		      System.out.println (n1+" is bigger");
		    } else if (n2>n1 && n2>n3) {
		      System.out.println (n2+" is bigger");
		    } else if (n3 > n1 && n3 >n1) {
		      System.out.println (n3+" is bigger");
		    }
		
	}

}
