import java.util.Scanner;
public class calculator {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Below Operation\n 1. Addition\n 2. subtraction\n 3. Multiplication\n 4. Division");
        int operation=sc.nextInt();
        if(operation!=1&&operation!=2&&operation!=3&&operation!=4)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Enter the value for the 1st Number");
            int a=sc.nextInt();
            System.out.println("Enter the value for the 2st Number");
             int b=sc.nextInt();
             if(operation==1)
             {
                 System.out.println("Addition of ("+a +"+"+b+") = "+(a+b));
             }
             else if(operation==2)
             {
                 System.out.println("Substraction of ("+a +"-"+b+") = "+(a-b));
             }
             else if(operation==3)
             {
                 System.out.println("Multiplication of ("+a +"*"+b+") = "+(a*b));
             }
             else if(operation==4)
             {
                 System.out.println("Multiplication of ("+a +"/"+b+") = "+(a/b));
             }
        }
    }
}
