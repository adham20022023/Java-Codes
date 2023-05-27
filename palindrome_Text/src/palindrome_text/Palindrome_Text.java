package palindrome_text;

import javax.swing.JOptionPane;

/**
 *
 * @author AAIE
 */
public class Palindrome_Text {

    public static void main(String[] args) {
      String input = JOptionPane.showInputDialog(null,"Enter String To Check");

      int check=0;
      int x1=0;
      int x2=input.length();
      char character1;
      char charater2;
      while(x1<x2)
      {
           character1=input.charAt(x1);
           charater2=input.charAt(x2-1);
          if(character1!=charater2)
          {
              check=1;
              break;
          }
          x1++;
          x2--;
          
      }
      if(check==1)
      {
          JOptionPane.showMessageDialog(null,"This Not Palindrome_Text");
      }
      else 
          JOptionPane.showMessageDialog(null,"This Is Palindrome_Text");
    }
    
}
