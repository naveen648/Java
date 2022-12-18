import java.util.Scanner;
public class Count 
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
        System.out.println("Enter the Digits");
        int n=s.nextInt();
        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println("Total Digits = "+count);
    }
    }
}
