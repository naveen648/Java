import java.util.Scanner;
import java.math.BigInteger;
public class fibonacci_using_biginteger 
{
    public static void main(String[] args)
    {
        
        try (Scanner sc = new Scanner(System.in)) 
        {
            int n=sc.nextInt();
            System.out.println(fibonacci(n));
        }
    }
    public static BigInteger fibonacci(int n)
    {
        BigInteger a=new BigInteger("0");
        BigInteger b=new BigInteger("1");
        BigInteger c=new BigInteger("1");
        for(int i=2;i<=n;i++)
        {
            c = a.add(b);
            a=b;
            b=c;
        }
        return b;
    }
}
