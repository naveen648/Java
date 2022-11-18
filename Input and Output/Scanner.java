import java.util.Scanner;

public class scanner {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int num1=sc.nextInt();
        System.out.println("enter 2nd numbe");
        int num2=sc.nextInt();
        System.out.println("num1 = "+ num1+"\tnum2 = "+num2);
        System.out.println("num1+num2 = "+(num1+num2));
    }
}
