import java.util.Scanner;
public class TableOfNumber 
{
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
        System.out.println("Enter the multiplier");
        int n=sc.nextInt();
        System.out.println("Enter the multiplicand");
        int m=sc.nextInt();
        int i=1;
        while(i<=m)
        {
            System.out.println(n*i);
            i++;
        }
        }
    }
}
