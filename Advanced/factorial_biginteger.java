import java.util.Scanner;
import java.math.BigInteger;
public class factorial_biginteger {
    public static BigInteger factorial(int a)
    {
        BigInteger C=new BigInteger("1");
        for(int i=2;i<=a;i++)
        {
            BigInteger D = BigInteger.valueOf(i);
            C=C.multiply(D);
        }
        return C;
    }
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            //int b=factorial(a);
            System.out.println(factorial(a));
        }
    }
    
}
