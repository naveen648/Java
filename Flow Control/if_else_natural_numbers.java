import java.util.Scanner;
public class if_else_natural_numbers {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number to print Natural Numbers");
    int input=sc.nextInt();
    if(input<0)
    {
        System.out.println("Invalid Input");
        return ;
    }
        System.out.println("Natural Numbers for "+input+" = "+input*(input+1)/2);
    }
}

