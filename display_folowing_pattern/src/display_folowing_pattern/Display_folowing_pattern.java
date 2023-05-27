package display_folowing_pattern;

public class Display_folowing_pattern {

    public static void main(String[] args)
    {
       for(int x=1;x<7;x++)
       {
           for(int y=1;y<=x;y++)//will stop when x=6
           {
               System.out.print(y+" ");
           }
           System.out.println("");
       }
        System.out.println("************************");
            for(int x=6;x>=1;x--)
       {
           for(int y=1;y<=x;y++)//will stop when x less than one 
           {
               System.out.print(y+" ");
           }
           System.out.println("");
       }
       
    }
    
}
