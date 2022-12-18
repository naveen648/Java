import java.util.Scanner;
public class CheckPrimeNumber
{
    public static void main(String[] args)
    {
        System.out.println("Enter the Number to check Prime or Non-Prime");
        try(Scanner sc=new Scanner(System.in))
        {
        int p=sc.nextInt();
        
        if(p%2==1&&p%3==2)
        {
            System.out.println(p+ " = Prime No. ");
        }
        else if(p==1||p==2)
        {
            System.out.println("1 = Prime No.");
        }
        else
        {
            System.out.println(p+ " = Non-Prime No.");
        }
        }
    }
}
