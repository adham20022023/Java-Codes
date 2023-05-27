package multiplication_table;

import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
	System.out.print("Enter number:");        
	int n=s.nextInt();
        for(int i=1; i <= 12; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
    
}
