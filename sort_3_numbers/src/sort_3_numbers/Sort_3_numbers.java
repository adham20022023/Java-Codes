package sort_3_numbers;

import javax.swing.JOptionPane;

public class Sort_3_numbers {
public static void displaySortedNumbers( double n1, double n2, double n3)
{
    final double highest = n1 > n2 && n1 > n3 ? n1 : n2 > n1 && n2 > n3 ? n2 : n3;//3 pro
    final double lowest = n1 < n2 && n1 < n3 ? n1 : n2 < n1 && n2 < n3 ? n2 : n3;//3
    final double middle = n1 != highest && n1 != lowest ? n1 : n2 != highest && n2 != lowest ? n2 : n3;//3
    JOptionPane.showMessageDialog(null,"Sorted Element:  \n "+highest+" > "+middle+" > "+lowest);
}
    public static void main(String[] args) {
       String s1=(JOptionPane.showInputDialog(null, "Enter Num1: "));
       double n1=Double.valueOf(s1);
       String s2=(JOptionPane.showInputDialog(null, "Enter Num2: "));
       double n2=Double.valueOf(s2);
       String s3=(JOptionPane.showInputDialog(null, "Enter Num3: "));
       double n3=Double.valueOf(s3);
        displaySortedNumbers(n1, n2, n3);
    }
    
}
