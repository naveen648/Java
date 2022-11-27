import java.util.Scanner;
public class pos_neg_even_odd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to Check if it is Negative, Postive & Odd, Even ");
        int input=sc.nextInt();
        if(input>0)
        {
            if(input%2==0)
            {
                System.out.println("Number Is \"POSITIVE\" & \"EVEN\"");
            }
            else
            {
                System.out.println("Number is \"POSITIVE\" &  \"ODD\"");
            }
        }
        else if(input<0)
        {
            if(input%2==0)
            {
                System.out.println("Number is \"NEGATIVE\" &  \"EVEN\"");
            }
            else
            {
                 System.out.println("Number is \"NEGATIVE\" &  \"ODD\"");
            }
        }
        else
        {
             System.out.println("Number is \"ZERO\"");
        }
    }
}
