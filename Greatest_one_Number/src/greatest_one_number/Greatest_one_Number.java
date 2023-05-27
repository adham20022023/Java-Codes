/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greatest_one_number;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author AAIE
 */
public class Greatest_one_Number {
    public static void main(String[] args) {
      /*  String nubmer1=JOptionPane.showInputDialog("Enter First Number");
        String number2=JOptionPane.showInputDialog("Enter Second Number");
        double x1=Double.parseDouble(nubmer1);
         double x2=Double.parseDouble(number2);
        if ( x1 >x2) {
            
            JOptionPane.showMessageDialog(null,"First Number Is Greatest Number");
        }
           if( x1 <x2) {
            
            JOptionPane.showMessageDialog(null,"Second Number Is Greatest Number");
        }
           if (x1==x2) {
               JOptionPane.showMessageDialog(null,"Two Numbers Are Equal");
            
        }
           JOptionPane.showMessageDialog(null,"Thank You For Using Our Programm Created By AAIE");
*/
      //another Way to take input from user with scanner 
      Scanner num1;
      Scanner num2;
      num1=new Scanner(System.in);
      num2=new Scanner(System.in);
        System.out.print("Enter First Nubmer: ");
        double x1=num1.nextDouble();
        System.out.print("Enter Second Number: ");
         double x2=num2.nextDouble();
              if ( x1 >x2) {//check if number one bigger than number2
            
                  System.out.println("First Number Is Greatest Number");
                  System.out.println("******************************************");
        }
           if( x1 <x2) {//check if number two bigger than number 2
            
               System.out.println("Second Number Is Greatest Number");
               System.out.println("******************************************");
        }
           if (x1==x2) {//check if two numbers are equal 
               System.out.println("Two Number Are Equal");
               System.out.println("******************************************");
            
        }
    }
    
}
