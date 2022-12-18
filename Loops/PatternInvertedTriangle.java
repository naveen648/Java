public class PatternInvertedTriangle 
{
    public static void main(String[] args)
    {
        for(int i=10;i>=1;i--)
        {
            for(int k=0;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=10-i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
