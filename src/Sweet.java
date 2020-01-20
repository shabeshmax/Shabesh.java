import java.util.Scanner;

public class Sweet {
    public static void main(String[] args) {
        Scanner get =new Scanner(System.in);
        int a,b;
        int x;
        int y;
        x=get.nextInt();
        y=get.nextInt();

        switch (x)
        {
            case 1:
                b=x+y;
                System.out.println("Addition");
                break;
            case 2:
                b=x-y;
                System.out.println("Subtraction");
                break;



        }
    }
}
