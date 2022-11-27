import java.util.Scanner;
public class if_else 
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number to check EVEN or ODD");
    int input=sc.nextInt();
    if(input%2==0)
    {
        System.out.println("Number "+input+" ->> EVEN");
    }
    else if(input%2==1)
    {
        System.out.println("Number "+input+" ->> ODD");
    }
    else
    {
        System.out.println("Entered Number is ERROR");
    }
    }
}
