package greatestcommondivisormethod;

import javax.swing.JOptionPane;

public class GreatestCommonDivisorMethod  {
    public static int gcd(int num1 ,int num2)
{
         if(num1==num2)
        {
            return num1;
        }
        else
        {
            int GCD=0;
        int k=1;//common divisors for all number smallest one

        while(k<=num1&&k<=num2)
        {
            if(num1%k==0&&num2%k==0)
                GCD=k;
            k++;
        }
        return GCD;
}}
    public static void main(String[] args) {
        int num1=Integer.valueOf(JOptionPane.showInputDialog("Enter Number 1"));
        int num2=Integer.valueOf(JOptionPane.showInputDialog("Enter Number 2"));
        JOptionPane.showMessageDialog(null,"The Biggest GCD\n"+gcd(num1, num2));
        
        
    }
    
}
