import java.math.BigInteger;
public class biginteger 
{
    public static void main(String[] args)
    {
        BigInteger A = new BigInteger("54");
        String b="1234567";
        BigInteger B=new BigInteger(b);
        int c=123467;
        BigInteger C=BigInteger.valueOf(c);
        BigInteger D = new BigInteger("100");
        BigInteger E = A.add(D);
        BigInteger F = A.multiply(D);
        BigInteger G = A.subtract(D);
        System.out.println(B);
        System.out.println(C);
        System.out.println(A);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
        System.out.println(G);
    }
}
