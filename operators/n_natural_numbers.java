import java.util.Scanner;
public class n_natural_numbers {
    public static void main(String[] args)
    {
        System.out.println("Enter the Number ");
        
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            System.out.println(n*(n+1)/2);
        }
    }
}
