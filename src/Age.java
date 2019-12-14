import javax.swing.*;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int x;
        System.out.print("Enter your age");
        x = get.nextInt();
        int age = x;
        if (x >= 18) {
            System.out.println("you are eligible to vote");
        } else {
            System.out.println("you are not eligible to vote");




        }
    }}