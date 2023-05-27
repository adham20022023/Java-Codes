package Palindrome_Text_Another_way;

import javax.swing.JOptionPane;

public class Palindrome_Text_Another_way {
    public static void main(String[] args) {
        char char1;
        String str=JOptionPane.showInputDialog("Enter String To Check If It Palindrome or Not");
        String str2="";
        for (int i = 0; i < str.length(); i++) {
            char1=str.charAt(i);
            str2=char1+str2;
        }
        if (str.equals(str2)) {
            JOptionPane.showMessageDialog(null,"This Is Palindrome_Text");
        }
        else
        {
        JOptionPane.showMessageDialog(null,"This Not Palindrome Text");
            
            
        }
        
    }
    
}
