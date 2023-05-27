package palindrome.number;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner num;
        num=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x=num.nextInt();
        int value=x;
        int digit=1;
        int reversed=0;
     while(x!= 0) {
    
      // get last digit from num
       digit = x % 10;
      reversed = reversed * 10 + digit;

      // remove the last digit from num
      x/= 10;
    }
        if (value==reversed) {
            System.out.println("This Number is palindrome number");
        }
        else 
            System.out.println("This Number Not Palindrome Number");
        System.out.println(value);
        System.out.println(reversed);
    }
}
