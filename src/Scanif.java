import java.util.Scanner;

public class Scanif {
    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);
        int a;
        a=get.nextInt();
        if (a==0)
        {
            System.out.println("zero");
        }
        if(a>0)
        {
            System.out.println("Positive");
        }

        if (a<0)
        {
            System.out.println("Negative");
        }
    }
}
