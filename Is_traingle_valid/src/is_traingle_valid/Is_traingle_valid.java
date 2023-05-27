
package is_traingle_valid;

import java.util.Scanner;

public class Is_traingle_valid {

    public static void main(String[] args)
    {
       Scanner num1,num2,num3;
       num1=new Scanner(System.in);
       num2=new Scanner(System.in);
       num3=new Scanner(System.in);
        System.out.println("Enter First Side");
       float n1=num1.nextFloat();
        System.out.println("Enter Second Side");
       float n2=num2.nextFloat();
        System.out.println("Enter Third side");
       float n3=num3.nextFloat();
        if ((n1+n2)<n3||(n1+n3)<n2||(n2+n3)<n1)
        {
            System.out.println("Not Valid Edges Can't represent Traingle");
        }
        else 
            System.out.println("Valid Edges Can represent Traingle");
    }
    
}
