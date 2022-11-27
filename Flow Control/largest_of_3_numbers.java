public class largest_of_3_numbers {
    public static void main(String[] args)
    {
        int a=10,b=20,c=30;
        if(a>=b&&a>=c)
        {
             System.out.println("\"a\" is largest of 3 numbers ");
        }
        else if(b>=a&&b>=c)
        {
            System.out.println("\"b\" is greatest of 3 numbers");
        }
        else
        {
             System.out.println("\"c\" is greatest of 3 numbers");
        }
    }
}
