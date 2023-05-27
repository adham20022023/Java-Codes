package month_and_numbers;

import javax.swing.JOptionPane;

public class Month_And_Numbers {

    public static void main(String[] args)   
    {
        String input=JOptionPane.showInputDialog("Enter Number Of Month To Get Name OF It");
        int month=Integer.valueOf(input);
        switch(month)
        {
            case 1:
                JOptionPane.showMessageDialog(null,"January");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"February");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"March");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"April");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"May");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"June");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"July");
                break;
            case 8:
                JOptionPane.showMessageDialog(null,"August");
                break;
            case 9:
                JOptionPane.showMessageDialog(null,"September");
                break;
            case 10:
                JOptionPane.showMessageDialog(null,"October");
                break;
            case 11:
                JOptionPane.showMessageDialog(null,"November");
                break;
            case 12:
                JOptionPane.showMessageDialog(null,"December");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Enter A fucking Valid Value :) ");      
        }
    }
    
}
