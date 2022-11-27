import java.util.Scanner;
public class leap_year {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the Year");
        int year=sc.nextInt();
        if(year%4==0&&year%100!=0)
        {
            System.out.println("Yes it is Leap year");
        }
        else if(year%400==0)
         {
             System.out.println("Yes it is leap year");
         }
         else
         {
                 System.out.println("No it is not a Leap Year");
         }
    }
}
