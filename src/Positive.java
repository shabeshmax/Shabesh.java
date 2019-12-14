import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);
        int a;
        a=get.nextInt();
        if (a==0)
        {
            System.out.print("it is zero");
        }
        if (a>0)
        {
            System.out.print("it is positive");
        }
        else
        {
            System.out.print("it is negative");
        }
    }
}
