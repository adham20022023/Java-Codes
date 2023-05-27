package check_posive_nagative;

import java.util.Scanner;

public class Check_Posive_Nagative {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number To Check + or - ");
        int x = input.nextInt();
        if (x > 0) {
            System.out.println("This Is Positve Number ");
        } else if(x<0) {
            System.out.println("This Is Nagative Number ");
        }
        else 
            System.out.println("انت عبيط يا ابني");
    }

}
