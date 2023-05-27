package convert_pound_to_kilo;

import java.util.Scanner;

/**
 *
 * @author AAIE
 */
public class Convert_pound_to_kilo {

    /**
     * @param args the command line arguments
     */

public static void main(String[] args) {
        //this programm to converts pounds into kilograms
        Scanner z;
        z=new Scanner(System.in);
        System.out.print("Enter A number To convert It into KIlograms: ");
        double x=z.nextDouble();
        //after convert
        x=x*0.454;//we know 1 kilo=0.454
        System.out.println("Pounds Of X Equal "+x+" In Kilograms");
    }
    
}
