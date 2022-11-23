import java.util.Scanner;
public class before_n_days 
{
    public static void main(String[] args)
    {
        //1 - Mon, 2 - Tue, 3 - Wed, 4 - Thur, 5 - Fri, 6 - Sat, 7 - Sun.
        try(Scanner sc=new Scanner(System.in))
        {
        System.out.println("Enter the current day in Number Form \"1 - 7\"");
        int x=sc.nextInt();
        System.out.println("enter the number of days \"BEFORE\"");
        int y=sc.nextInt();
        int d=Math.abs(y%7);
        int ans=Math.abs(d-x);
        System.out.println("The Day = "+ans);
        }
    }
}
