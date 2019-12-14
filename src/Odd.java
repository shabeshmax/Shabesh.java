import javax.swing.*;
import java.util.Scanner;

public class Odd{
    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);
        int x;
        System.out.print("enter a number");
        x=get.nextInt();
        int number=x;
        if(number%2==0)
        {
            System.out.print("it is even");
        }
        else
        {
            System.out.print("it is odd");
        }
    }
}