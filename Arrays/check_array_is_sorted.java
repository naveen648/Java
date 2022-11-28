import java.util.Scanner;
public class check_array_is_sorted {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of arrays");
        int n=sc.nextInt();
        int [ ]a=new int[n];
        System.out.println("Enter the values for "+n+" arrays");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        boolean ans=is_sorted(a,n);
        if(ans==true)
        {
            System.out.println("Yes Sorted");
        }
        else
        {
            System.out.println("Not Sorted");
        }
    }
    public static boolean is_sorted(int[ ]a,int n)
    {
        for(int i=1;i<n;i++)
        {
            if(a[i]<a[i-1])
            {
                return false;
            }
        }
        return true;
    }
}
