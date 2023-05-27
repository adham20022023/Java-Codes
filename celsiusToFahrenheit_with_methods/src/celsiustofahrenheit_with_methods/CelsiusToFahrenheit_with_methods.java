package celsiustofahrenheit_with_methods;

import javax.swing.JOptionPane;

public class CelsiusToFahrenheit_with_methods {
    public static double celsiusToFahrenheit(double celsius)
    {
         double fahrenheit = (9.0 / 5) * celsius + 32;
         return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit)
     {
         double celsius;
         celsius= (5.0 / 9) * (fahrenheit - 32);
         return celsius;
     }

    public static void main(String[] args) {
        double d1=Double.valueOf(JOptionPane.showInputDialog("Enter Degree In Celsius \n"));
        double d2=Double.valueOf(JOptionPane.showInputDialog("Enter Degree In Fahrenheit\n"));
        JOptionPane.showMessageDialog(null,"First Degree In Faherenheit :"+celsiusToFahrenheit(d1));
         JOptionPane.showMessageDialog(null,"Second Degree In Celsius: "+fahrenheitToCelsius(d2));
         JOptionPane.showMessageDialog(null,"Created By AAIE");
    }
    
}
