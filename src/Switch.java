import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);
        int a,b,c,x;
        System.out.print("Enter A:");
        a=get.nextInt();
        System.out.print("Enter B");
        b=get.nextInt();
        System.out.print("1.add     ");
        System.out.print("2.Sub     ");
        System.out.print("3.Mul     ");
        System.out.print("4.div     ");
        System.out.println("Enter choice");
        x=get.nextInt();
        switch(x)
        {
            case 1:
                c=a+b;
                System.out.print("The Sum of"+a+"&"+b+"is"+c );
                break;
            case 2:
                c=a-b;
                System.out.print("The diff of"+a+"&"+b+"is"+c);
                break;
            case 3:
                c=a*b;
                System.out.print("The prod of"+a+"&"+b+"is"+c);
                break;
            case 4:
                c=a/b;
                System.out.print("the div of"+a+"&"+b+"is"+c);
                break;
            default:
                System.out.print("No choices found");
                break;

        }











    }
}
