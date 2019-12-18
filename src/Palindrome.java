import javax.swing.*;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        String s;
        String t="";
        int length;
        int i;
        int j=0;
        System.out.println("Enter a String:");
        s = get.next();
        System.out.println(s);
       // System.out.println(s.length());
        length = s.length();
        j=length-1;
        for (i = 0; i < length; i++) {
            //   System.out.println(s.charAt(j));
            t = t + s.charAt(j);
            j = j - 1;
        }

            if(s.equals(t))
            {
                System.out.println("Palindrome");
            }
            else
            {
                System.out.println("Not a Palindrome");
            }






       // System.out.println(t);
    }
}
