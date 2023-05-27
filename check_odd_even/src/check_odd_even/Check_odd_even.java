package check_odd_even;

import javax.swing.JOptionPane;

public class Check_odd_even {
    public static void main(String[] args)
    {
         String num=JOptionPane.showInputDialog("Check Odd Or Even");
        int num2=Integer.parseInt(num);
        if (num2==0) {
            JOptionPane.showMessageDialog(null,"Not Even Or Odd");
            
        }
        if(num2%2==0&&num2>0)
        {
            JOptionPane.showMessageDialog(null,"This Is Even Number");
        }
        if(num2%2!=0)
            JOptionPane.showMessageDialog(null,"This is Odd Number");
    }
    
}
