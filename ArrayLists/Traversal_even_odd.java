import java.util.ArrayList;
import java.util.Scanner;
public class Traversal_even_odd 
{
    public static void main(String[] args)
    {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter Number of Entries");
            int n=s.nextInt();
            int []a=new int[n];
            //ArrayList<Integer> al=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();
            }
            getEvenOdd(a);
        }
    }
    public static void getEvenOdd(int []a)
    {
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                even.add(a[i]);
            }
            else
            {
                odd.add(a[i]);
            }
        }
        for(int i=0;i<odd.size();i++)
        {
            System.out.print(odd.get(i)+" ");
        }
        System.out.println("");
        for(int i=0;i<even.size();i++)
        {
            System.out.print(even.get(i)+" ");
        }
    }
}
