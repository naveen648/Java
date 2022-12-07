import java.util.Scanner;
public class reverse_string {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b="";
        int length=a.length()-1;
        while(length>=0)
        {
            b=b+a.charAt(length);
            length--;
        }
        System.out.println(b);
    }
}
