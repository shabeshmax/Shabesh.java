import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
Scanner get=new Scanner(System.in);
int x;
System.out.print("Enter score:");
x=get.nextInt();
switch (x) {
    case 'A':
        System.out.print("90 - 100");
        break;
    case 'B':
        System.out.println("80-89");
        break;
    case 'C':
        System.out.println("70-79");
        break;
    case 'D':
        System.out.println("50-69");
        break;
    case 'F':
        System.out.println("0-59");
        break;
    default:
        break;


}
    }
}
