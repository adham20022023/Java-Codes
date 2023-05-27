package check_vowel;

import java.util.Scanner;

public class Check_Vowel {
    public static void main(String[] args)
    {
        Scanner input;
        input= new Scanner(System.in);
        System.out.println("Enter Character To Check");
        char ch=input.next().toUpperCase().charAt(0);
        switch(ch)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("This Is Vowel Character");
            break;
            default:
                System.out.println("This Is Constant, Character Not Vowel !!");
                
        }

    }
    
}
