import javax.swing.*;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner get=new Scanner(System.in);
        int x;
        System.out.print("enter year:");
        x=get.nextInt();
        int year=x;
        if(year%4==0)
        {
            System.out.println(year+"is a leap year");
    }
            else
        {
            System.out.println(year+"is not a leap year");
        }
    }
}
