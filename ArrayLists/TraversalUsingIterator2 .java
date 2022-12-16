import java.util.Iterator;
import java.util.ArrayList;
public class TraversalUsingIterator2 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(9);
        al.add(5);
        Iterator<Integer> it=al.iterator(); //remove '<Integer>'
        while(it.hasNext())
        {
            int x=it.next();  // 
            if(x<10)
            {
                it.remove();
            }
            else
            {
            System.out.println(x);
            }
        }
    }
}
