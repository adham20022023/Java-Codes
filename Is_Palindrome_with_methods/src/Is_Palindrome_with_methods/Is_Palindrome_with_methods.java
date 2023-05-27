package Is_Palindrome_with_methods;

import javax.swing.JOptionPane;

public class Is_Palindrome_with_methods {
    private static void isPalindrome(int num)//create method which accept 1 parameter to check if it palindrome or not
    {
        int num2=num;//save value of num because it will change :)
        int reversed=0;//save value of the reversed number
        int digit;
        while(num2!=0)//check the end of integer value :)
        {
            digit=num2%10;
            reversed=reversed*10+digit;
            num2=num2/10;
        }
        if(reversed==num)
            JOptionPane.showMessageDialog(null, "This is palindrome Number");
        else
          JOptionPane.showMessageDialog(null, "This Not palindrome Number");  
    }
    public static void main(String[] args) {
        int input;
         input=Integer.valueOf(JOptionPane.showInputDialog("Enter Number To Check" ));//parameter for function 
         isPalindrome(input);//function to check if number is palindrome or not
        
        
    }
    
}
