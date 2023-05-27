package total_average;

import javax.swing.JOptionPane;

public class Total_average {
    public static void main(String[] args)
    {
        int sum=0;
        int counter=0;
        int input=0;
        while(true)
        {
            input =Integer.valueOf(JOptionPane.showInputDialog("Enter Numbers when You End Enter -1"));
            if(input!=-1)
            {
            sum+=input;
            counter++;
            }
            else 
                break;
        }
        JOptionPane.showMessageDialog(null,"The Sum Of Input Numbers: "+sum+"  The Average Is: "+sum/counter);
        JOptionPane.showMessageDialog(null,"Created By AAIE");
        
    }
    
}
