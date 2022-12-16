import java.util.ArrayList;
import java.util.Iterator;
public class TraversalUsingIterator {
    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Java");
        al.add("Coding");
        al.add("Courses");
        Iterator<String> it=al.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+"  ");
        }
    }
}
