public class swapping_two_numbers
{
     public static void main(String[] args) 
    {
        int a=10;
        int b=20;
        System.out.println("Before ->> "+"a = "+a+"\tb ="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println(" After ->> "+"a = "+a+"\tb ="+b);
    }
}