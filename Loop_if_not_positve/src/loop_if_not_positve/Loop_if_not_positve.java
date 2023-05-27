package loop_if_not_positve;

import java.util.Scanner;

public class Loop_if_not_positve {

    public static void main(String[] args){
        int x=0;
        do
        {
        Scanner input;
        input=new Scanner(System.in);
        System.out.println("Enter Positve Number");
        x=input.nextInt();
        }while(x<0);
        if(x>0)
            System.out.println("Correct Postive Number");
    }
}
  
        
    
