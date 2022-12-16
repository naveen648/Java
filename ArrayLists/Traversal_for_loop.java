import java.util.ArrayList;
public class Traversal_for_loop {
    public static void main(String[] args)
    {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        for(int i=0;i<al.size();i++)
        {
            int x=al.get(i);
            al.set(i,x*2);
        }
        System.out.println(al);
    }
}
