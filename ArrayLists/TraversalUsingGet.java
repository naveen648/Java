import java.util.ArrayList;
public class TraversalUsingGet {
    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Java");
        al.add("Coding");
        al.add("Courses");
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
    }
}
