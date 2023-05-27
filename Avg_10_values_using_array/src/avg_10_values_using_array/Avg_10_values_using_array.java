
package avg_10_values_using_array;

import javax.swing.JOptionPane;

public class Avg_10_values_using_array {
    public static int avg(int[]arr)
    {
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        return sum/arr.length;
    }
        public static int avg(double[]arr)
    {
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        return sum/arr.length;
    }
    public static void main(String[] args) {
        int size=Integer.valueOf(JOptionPane.showInputDialog("Enter Number Of Student You Want To get Their Average "));
        int [] arr=new int[size];
        for (int i = 0; i < arr.length; i++)//size {
           arr[i]=Integer.valueOf(JOptionPane.showInputDialog("Enter Grade No."+(i+1)));
            JOptionPane.showMessageDialog(null,"The Avg \n"+avg(arr));
        }
    }
    

