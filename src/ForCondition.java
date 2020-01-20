import java.util.Scanner;

public class ForCondition {
    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);
        int a,b,c;
        a=get.nextInt();
        b=get.nextInt();
        c=get.nextInt();
        for (c=3;c<=6;c++)
        {
            System.out.println(a);
        }
        for (a=1;a<=4;a++)
        {
            for (b=2;b<=5;b++)
            System.out.println(c);
        }

    }
}
