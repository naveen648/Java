import java.util.Scanner;
public class last_digit {
    public static void main(String[] args)
    {
        System.out.println("Enter the number Greater the 9");
        try(Scanner sc=new Scanner(System.in))
        {
            int a=sc.nextInt();
            System.out.print("last Digit = ");
            System.out.println(a%10);
        }
    }
}
